package ma.rick;

/**
 * 客户端调用
 *
 * @author M
 */
public class RunClient {

	public static void main(String[] args) {
		
		//原始用法
		System.out.println("###########原始用法#####################");

		doCRUD(new BasicExecuter());

		//AOP用法
		System.out.println("############AOP用法####################");
		/**
		 * 模拟：登录会员有权限
		 */
		doCRUD(AuthProxyExecuterEnhancer.getInstance("togoever"));
		System.out.println("############AOP用法####################");
		/**
		 * 模拟：没有权限的会员，可以作查询操作
		 */
		doCRUD(AuthProxyExecuterEnhancer.getInstance("xxx"));

	}

	/**
	 * 做增加／更新／删除／查询操作
	 *
	 * @param manager
	 */
	public static void doCRUD(BasicExecuter manager) {
		manager.query();
		manager.create();
		manager.update();
		manager.delete();
	}

}
