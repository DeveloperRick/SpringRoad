/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author M
 */
public class Run {

	public static void main(String args[]) {

		ClassPathResource cpr = new ClassPathResource("ma/rick/factory-configuration.xml");
		XmlBeanFactory xbf = new XmlBeanFactory(cpr);
		System.out.println("new XmlBeanFactory()，程序已经实例化BeanFactory...");
		
		
		Person p1 = (Person) xbf.getBean("Wang");
		System.out.println("getBean(\"Wang\")，程序中已经完成了Wang Bean的实例化...");
		p1.sayHelloTo("Xiaoming");
		
		Person p2 = (Person) xbf.getBean("Lucy");
		System.out.println("getBean(\"Lucy\")，程序中已经完成了Lucy Bean的实例化...");
		p2.sayGoodbyeTo("Tong");
		 
		Person p3 = (Person) xbf.getBean("Tom");
		System.out.println("getBean(\"Tom\")，程序中已经完成了Tom Bean的实例化...");
		p3.sayGoodbyeTo("Rick");
		
	}

}
