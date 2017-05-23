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
public class Go {
 
	public static void main(String args[]) {
		
		ApplicationContext actx = new ClassPathXmlApplicationContext("ma/rick/beans-listener.xml");		
		System.out.println();
		EmailEvent event1 = (EmailEvent) actx.getBean("emailEvent");
		actx.publishEvent(event1);	 
		System.out.println();
		EmailEvent event2 = new EmailEvent("WELCOME","togoever@163.com","how are you?");
		actx.publishEvent(event2); 
	
	}
	

}
