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
public class Run4 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		ApplicationContext context,contextByName,contextByType,contextConstructor;
		context= new ClassPathXmlApplicationContext("ma/rick/beans.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person.toString());
		
		contextByName= new ClassPathXmlApplicationContext("ma/rick/beans_byName.xml");
		Person personByName = (Person) context.getBean("person");
		System.out.println(personByName.toString());
		
		contextByType= new ClassPathXmlApplicationContext("ma/rick/beans_ByType.xml");
		Person personByType = (Person) context.getBean("person");
		System.out.println(personByType.toString());
		
		contextConstructor= new ClassPathXmlApplicationContext("ma/rick/beans_constructor.xml");
		Person personConstructor = (Person) context.getBean("person");
		System.out.println(personConstructor.toString());
		
	}

}
