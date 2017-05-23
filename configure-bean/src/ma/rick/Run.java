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
public class Run {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		ApplicationContext conf = new ClassPathXmlApplicationContext("ma/rick/Config.xml");
		Child wang = (Child) conf.getBean("wang");
		Child li = (Child) conf.getBean("li");
		Child bill = (Child) conf.getBean("tom");
		Child tom = (Child) conf.getBean("bill");
		Child lucy = (Child) conf.getBean("lucy");
		Child petter = (Child) conf.getBean("petter");
		Child little = (Child) conf.getBean("little");
		System.out.println("--------------------------------------");
		wang.whoIsFriend();
		li.whoIsFriend();
		bill.whoIsFriend();
		tom.whoIsFriend();
		lucy.whoIsFriend();
		petter.whoIsFriend();
		little.whoIsFriend();

	}

}
