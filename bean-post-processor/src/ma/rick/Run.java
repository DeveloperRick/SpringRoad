/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 *
 * @author Administrator
 */
public class Run {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		ClassPathResource isr = new ClassPathResource("ma/rick/Config.xml");
		System.out.println("---------------------");
		XmlBeanFactory factory = new XmlBeanFactory(isr);
		System.out.println("---------------------");
		MyBeanPostProcessor prr = (MyBeanPostProcessor) factory.getBean("myBeanPostProcessor");
		factory.addBeanPostProcessor(prr);
		System.out.println("程序已经实例化BeanFactory...");
		Man man = (Man) factory.getBean("ma");
		System.out.println("程序中已经完成了man bean的实例化...");
		System.out.println("他的名字是 " + man.getName());
		System.out.println("---------------------");
		System.out.println("---------------------");
		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/Config_1.xml");
		Computer c = (Computer) ac.getBean("computer1");
		System.out.println("程序中已经完成了computer1的实例化...");
		c.initRun();

	}

}
