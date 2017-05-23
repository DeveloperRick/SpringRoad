/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class RunLookup {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("=====================================");
		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/LookupConfig.xml");
		//
		System.out.println("================容器初始化完成"
			+ "=====================");
		((Car) ac.getBean("benz")).Run();
		System.out.println("=====================================");
		((Car) ac.getBean("benz")).Run();
		System.out.println("=====================================");
		((Car) ac.getBean("benz")).Run();
		System.out.println("=====================================");
		((Australian) ac.getBean("Rick")).driveMyCar();
		System.out.println("=====================================");
		((Australian) ac.getBean("Rick")).driveMyCar();

		System.out.println("=====================================");
		((Australian) ac.getBean("Rick")).driveMyCar();

		System.out.println("=====------------------------=====--------------------------====");
		Car c1 = ((Sydneyer) ac.getBean("Rick")).getCar();
		Car c2 = ((Sydneyer) ac.getBean("Rick")).getCar();
		System.out.println("没有采用lookup-method的情况，判断两实例是否是同一个引用：" + (c1 == c2));

		System.out.println("=====================================");
		Car c3 = ((Sydneyer) ac.getBean("Rick")).buyCar();
		Car c4 = ((Sydneyer) ac.getBean("Rick")).buyCar();
		System.out.println("abstract方法，采用lookup-method和prototype的情况，会产生新的实例！");
		System.out.println("判断两实例是否是同一个引用：" + (c3 == c4));

		System.out.println("=====------------------------=====--------------------------====");
		Car c5 = ((Sydneyer) ac.getBean("Ricky")).getCar();
		Car c6 = ((Sydneyer) ac.getBean("Ricky")).getCar();
		System.out.println("没有采用lookup-method的情况，判断两实例是否是同一个引用：" + (c5 == c6));

		System.out.println("=====================================");
		Car c7 = ((Sydneyer) ac.getBean("Ricky")).buyCar();
		Car c8 = ((Sydneyer) ac.getBean("Ricky")).buyCar();
		System.out.println("abstract方法，采用lookup-method和prototype的情况，会产生新的实例！");
		System.out.println("判断两实例是否是同一个引用：" + (c7 == c8));

	}

}
