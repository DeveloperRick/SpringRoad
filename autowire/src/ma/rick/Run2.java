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
public class Run2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/beans_autowire_candidate.xml");
		//byName
		Computer computer1 = (Computer) ac.getBean("computer1");
		System.out.println("autowire=\"byName\":");
		computer1.run();

		//autowire-candidate="false"
		Computer computer4 = (Computer) ac.getBean("computer4");
		System.out.println("autowire-candidate=\"false\"");
		computer4.run(); 
		 

		 
	}

}
