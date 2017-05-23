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
public class Run3 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/beans_default_autowire_candidates.xml");
		
		//computer1
		Computer computer1 = (Computer) ac.getBean("computer1");
		System.out.println("computer1:");
		computer1.run();

		// computer2
		Computer computer2 = (Computer) ac.getBean("computer2");
		System.out.println("computer2:");
		computer2.run(); 
		 
		// computer3
		Computer computer3 = (Computer) ac.getBean("computer3");
		System.out.println("computer3:");
		computer3.run(); 
		 
		//computer11
		Computer computer11 = (Computer) ac.getBean("computer11");
		System.out.println("computer11:");
		computer11.run();

		// computer12
		Computer computer12 = (Computer) ac.getBean("computer12");
		System.out.println("computer12:");
		computer12.run(); 
		 
		// computer13
		Computer computer13 = (Computer) ac.getBean("computer13");
		System.out.println("computer13:");
		computer13.run(); 
		 
		// computer4
		Computer computer4 = (Computer) ac.getBean("computer4");
		System.out.println("computer4:");
		computer4.run(); 
		 
	}

}
