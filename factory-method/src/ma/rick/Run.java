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
	public static void main(String arg[]){
		XmlBeanFactory factory=new XmlBeanFactory(new ClassPathResource("ma/rick/bean.xml"));		
		System.out.println("new XmlBeanFactory()，程序已经实例化BeanFactory...");
		Being b=(Being)factory.getBean("dog1");
		b.testBeing();
		b=(Being)factory.getBean("cat1");
		b.testBeing(); 
	}
}
