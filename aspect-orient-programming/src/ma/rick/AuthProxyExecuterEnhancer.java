package ma.rick;

import ma.rick.BasicExecuter;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

/**
 *
 * @author M
 */
public class AuthProxyExecuterEnhancer {

	/**
	 * 创建不同权限要求的ActionExecuter
	 *
	 * @param userName
	 * @return
	 */
	public static BasicExecuter getInstance(String userName) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(BasicExecuter.class);
		AuthProxyMethodInterceptor authProxy = new AuthProxyMethodInterceptor(userName);
		enhancer.setCallbacks(new Callback[]{authProxy, NoOp.INSTANCE});
		enhancer.setCallbackFilter(new AuthProxyCallbackFilter());
		return (BasicExecuter) enhancer.create();
	}
}
