package ma.rick;

import java.lang.reflect.Method;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 权限代理方法拦截器
 *
 */
public class MyMethodInterceptor implements MethodInterceptor {

	private String userName; 
	private String rootName;

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

		Object result = null;
		if (!rootName.equals(this.userName)) {
			System.out.println("NO permits for Action:" + method);
		} else {
			System.out.append("Have permits  for Action:" + method +"...");
			System.out.println("Before invoke " + method);
			result = proxy.invokeSuper(obj, args);
			System.out.println(">>>>>>>>After invoke " + method);
		}
		return result;
	}
 
	public void setUserName(String userName) {
		this.userName = userName;
	}
 
	public void setRootName(String rootName) {
		this.rootName = rootName;
	}

}
