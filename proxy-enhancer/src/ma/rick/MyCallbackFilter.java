package ma.rick;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.CallbackFilter;

public class MyCallbackFilter implements CallbackFilter {

	private static final int AUTH_NEED = 0;
	private static final int AUTH_NOT_NEED = 1;
	private String[] acceptMethods;//;

	@Override
	public int accept(Method method) {
		for (String acceptMethodName : acceptMethods) {
			if (acceptMethodName.equals(method.getName())) {
				return AUTH_NEED;
			}
		}
		return AUTH_NOT_NEED;
	}

	public void setAcceptMethods(String[] acceptMethods) {
		this.acceptMethods = acceptMethods;
	}

}
