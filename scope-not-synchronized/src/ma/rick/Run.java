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
public class Run {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		System.out.println("=====================================");
		ApplicationContext ac=new ClassPathXmlApplicationContext("ma/rick/XMLConfig.xml");
		//
		System.out.println("================容器初始化完成"
			+ "=====================");
		((Car)ac.getBean("honda")).Run();
		System.out.println("=====================================");
		((Car)ac.getBean("honda")).Run();
		System.out.println("=====================================");
		((Car)ac.getBean("honda")).Run();
		System.out.println("=====================================");
		((Australian)ac.getBean("Jim")).driveMyCar();
		System.out.println("=====================================");
		((Australian)ac.getBean("Jim")).driveMyCar();
		System.out.println("=====================================");
		((Australian)ac.getBean("Jim")).driveMyCar();
		System.out.println("=====================================");
		((Car)ac.getBean("honda")).Run();
		System.out.println("=====================================");
		((Car)ac.getBean("honda")).Run();
		System.out.println("=====================================");
		((Car)ac.getBean("honda")).Run();
		System.out.println("=====================================");
		((Australian)ac.getBean("Jim")).driveMyCar();
		System.out.println("=====================================");
		((Australian)ac.getBean("Jim")).driveMyCar();
		System.out.println("--------------------========-----------------------======--------------------");
		((Car)ac.getBean("byd")).Run();
		System.out.println("=====================================");
		((Car)ac.getBean("byd")).Run();
		System.out.println("=====================================");
		((Australian)ac.getBean("Tom")).driveMyCar();
		System.out.println("=====================================");
		((Car)ac.getBean("byd")).Run();
		System.out.println("=====================================");
		((Australian)ac.getBean("Tom")).driveMyCar();
		System.out.println("=====================================");
		((Car)ac.getBean("byd")).Run();
		System.out.println("=====================================");
		
		
		
	}
	
}
