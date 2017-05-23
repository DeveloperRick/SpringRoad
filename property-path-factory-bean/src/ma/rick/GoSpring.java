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
 * @author M
 */
public class GoSpring {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		ApplicationContext c;
		c = new ClassPathXmlApplicationContext("ma/rick/property_inject.xml");
		
		Son son1 = c.getBean("son1",Son.class);
		Son son2 = c.getBean("son2",Son.class);
		String son3age = (String) c.getBean("son3age");
		String son4age = (String) c.getBean("son4age");

		System.out.println("person age is:" + son1.getAge());
		System.out.println("person age is:" + son2.getAge());
		System.out.println("person age is:" + son3age);
		System.out.println("person age is:" + son4age);
		 
	}

}
