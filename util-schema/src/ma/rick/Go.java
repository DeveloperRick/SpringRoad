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
public class Go {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		
		ApplicationContext ac =new ClassPathXmlApplicationContext("ma/rick/config.xml");
		Man m=(Man)ac.getBean("Xiaoqiang");
		m.test();
		System.out.println(ac.getBean("test.books"));
		System.out.println(ac.getBean("test.health"));
		System.out.println(ac.getBean("test.message"));
		System.out.println(ac.getBean("test.message_zh"));
		System.out.println(ac.getBean("test.message_en"));
		 
		
	}
	
}
