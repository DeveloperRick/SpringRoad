/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Administrator
 */
public class Run {

	public static void main(String args[]) {

		//  ApplicationContext ac = new ClassPathXmlApplicationContext("DI-ConfigureBean.xml");
		//  Person p = (Person) ac.getBean("chinese");
		Resource isr = new ClassPathResource("ma/rick/beanFactory.xml.xml");

		XmlBeanFactory factory1;
		factory1 = new XmlBeanFactory(isr);

		System.out.println(factory1);
		Chinese p;

		p = (Chinese) factory1.getBean("chinese");

		BeanFactory factory2 = p.gainMyFactoryInstance();
		System.out.println(factory2);
		System.out.println(factory1 == factory2);

		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/beanFactory.xml.xml");
		English tom = (English) ac.getBean("tom");

		ClassPathXmlApplicationContext haha ;
		haha= (ClassPathXmlApplicationContext) tom.gainMyApplicationContextFactoryInstance();
		System.out.println(haha.getBean("chinese"));

	}
}
