/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import ma.rick.Man;
import ma.rick.generics.Bookshelf;
import ma.rick.merge.AddressBook;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class SpringRun {

	/**
	 * @param args the command line arguments
	 */
 	public static void main(String[] args) {
		ApplicationContext ac;
		ac= new ClassPathXmlApplicationContext("ma/rick/beans.xml");
		Man r=(Man) ac.getBean("Rick");
		r.test();
		ac = new ClassPathXmlApplicationContext("ma/rick/generics/beans.xml");
		Bookshelf bs =  (Bookshelf) ac.getBean("bookshelf");
		bs.displayPrices();
		 ac = new ClassPathXmlApplicationContext("ma/rick/merge/beans.xml");
		AddressBook ab = (AddressBook) ac.getBean("child");
		ab.displayEmails();
	}
	

	/**/
}
