package ma.rick;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.CallbackFilter;

/**
 * 权限代理回调过滤器
 */
public class AuthProxyCallbackFilter implements CallbackFilter {

	private static final int AUTH_NEED = 0;
	private static final int AUTH_NOT_NEED = 1;

	/**
	 * 选择使用的proxy 如果调用query函数，则使用第二个proxy 否则，使用第一个proxy
	 *
	 * @param method
	 * @return
	 */
	@Override
	public int accept(Method method) {
		if ("query".equals(method.getName())) {
			return AUTH_NOT_NEED;
		}
		return AUTH_NEED;
	}

}
