/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

/**
 *
 * @author Administrator
 */
public abstract class Sydneyer extends Australian {

	public Sydneyer() {
		System.out.println("Sydneyer:构造函数Sydneyer()");
	}

	public Sydneyer(String name) {
		super(name);
		System.out.println("Sydneyer:构造函数Sydneyer(String name=" + name + ")");
	}

	public Sydneyer(String name, Car car) {
		super(name, car);
		System.out.println("Sydneyer:构造函数Sydneyer(String name=" + name + ", Car car=" + car.name + ")");
	}

	/*
			通过Spring完成 实例化
			对于method在代码中的签名有下面的标准：
			<public|protected> [abstract] <return-type> theMethodName(no-arguments);
			public|protected要求方法必须是可以被子类重写和调用的；
			abstract可选，如果是抽象方法，CGLIB的动态代理类就会实现这个方法，
					如果不是抽象方法，就会覆盖这个方法，所以没什么影响；
			return-type就是non-singleton-bean的类型咯，当然可以是它的父类或者接口。
			no-arguments不允许有参数。   
	*/
	public abstract Car buyCar();

	/**
	 *
	 * Spring将完成以下实现 设置lookup-method
	 *
	 * public Car buyCar(){ //获取容器ac ... return ac.getBean("Car001") }
	 */

	/* 
	 * @return 
	 **/
	@Override
	public Car getCar() {
		return super.getCar();
	}
	
	public void driveTheCar(Car c){
		System.out.println("Sydneyer:driveTheCar(Car)>>>I drive the car: "+c.name);
	}

}
