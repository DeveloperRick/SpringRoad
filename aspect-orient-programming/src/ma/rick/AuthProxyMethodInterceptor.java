package ma.rick;


import java.lang.reflect.Method;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * 权限代理方法拦截器
 * 
 */
public class AuthProxyMethodInterceptor implements MethodInterceptor {

	private final String name; // 会员登录名

	public AuthProxyMethodInterceptor(String name) {
		System.out.println("the loginer's name is :" + name);
		this.name = name;
	}

	/**
	 * 权限校验，如果会员名为:togoever，则有权限做操作，否则提示没有权限
	 *
	 * @param obj
	 * @param method
	 * @param args
	 * @param proxy
	 * @return
	 * @throws java.lang.Throwable
	 */
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		Object result = null;
		if (!"togoever".equals(this.name)) {
			System.out.println("AuthProxy:you have NO permits to do Action Executer!");
		} else {
			System.out.append("so have permits do Action Executer...");
			System.out.println("Before invoke " + method);
			result = proxy.invokeSuper(obj, args);
			System.out.println(">>>>>>>>After invoke " + method);
		}
		return result;
	}



}
