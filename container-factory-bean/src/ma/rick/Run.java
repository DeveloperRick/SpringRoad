/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author M
 */
public class Run {

	public static void main(String[] args) {
		Resource res = new ClassPathResource("ma/rick/beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		System.out.println(factory.getBean("factoryBeanOne").getClass());
		System.out.println(factory.getBean("factoryBeanTwo").getClass());
		System.out.println("I am " + factory.getBean("ppp"));
		// isSingleton() =true;
		Boolean result =factory.getBean("ppp")==factory.getBean("ppp");
		System.out.println("Test whether the same: " .concat(result.toString()));
		System.out.println("Test the factory itself: " .concat( factory.getBean("&ppp").toString() ));
	}
}
