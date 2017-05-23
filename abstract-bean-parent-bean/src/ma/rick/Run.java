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
	public static void main(String[] args) {
			System.out.println("");
		//American:abstract="true"
		//Chinese:abstract="false"
		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/bean-configuration.xml");

		System.out.println("new ClassPathXmlApplicationContext()，程序已经实例化ApplicationContext...");
		Person p = (Person) ac.getBean("xiaoming");
		System.out.println("getBean(\"xiaoming\")，程序中已经完成了xiaoming Bean的实例化...");
		p.useAxe();
		
		System.out.println("## Test Spring Bean INHERITANCE ##");
		
		System.out.println("#### xiaoqiang:");
		((Person) ac.getBean("xiaoqiang")).useAxe();
		
		System.out.println("#### Petter:");
		((Person) ac.getBean("Petter")).useAxe();
		
		System.out.println("#### Jerry:");
		((Person) ac.getBean("Jerry")).useAxe();
		
		System.out.println("#### Tom:");
		((Cat) ac.getBean("Tom")).useAxe();
	}
}
