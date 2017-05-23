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
public class Exe {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/newSpringXMLConfig.xml");
		
		ApplicationContext myac = new ClassPathXmlApplicationContext("ma/rick/mySchema.xml");
		Order o1 = (Order) myac.getBean("order1");
		System.out.println("");
		System.out.println(o1);

	}
}
