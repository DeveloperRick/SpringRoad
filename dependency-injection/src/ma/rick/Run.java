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

/**
 *
 * @author M
 */
public class Run {

	public static void main(String args[]) {
		System.out.println(System.getenv().toString());
		//
		ApplicationContext ac = (ApplicationContext) new ClassPathXmlApplicationContext("ma/rick/DI-ConfigureBean.xml");

		Person p = (Person) ac.getBean("chinese");
		p.useAxe();
		p = (Person) ac.getBean("xiaoming");
		p.useAxe();
		p = (Person) ac.getBean("xiaoqiang");
		p.useAxe();
		ac.getAutowireCapableBeanFactory().destroyBean(p);
		//
		ClassPathResource res;
		res = new ClassPathResource("ma/rick/DI-ConfigureBean.xml");

		BeanFactory beanFactory = new XmlBeanFactory(res);
		//
		System.out.println();
		//id="stoneAxe" class="ma.rick.StoneAxe" scope="prototype"
		System.out.println("prototype 原型，雏形，蓝本");
		System.out.print("scope=\"prototype\":");
		System.out.println(beanFactory.getBean("stoneAxe") == beanFactory.getBean("stoneAxe"));
		//id="steelAxe" class="ma.rick.SteelAxe"
		System.out.print("default:");
		System.out.println(beanFactory.getBean("steelAxe") == beanFactory.getBean("steelAxe"));
		//id="chinese" class="ma.rick.Chinese"  scope="singleton" 
		System.out.print("scope=\"singleton\":");
		System.out.println(beanFactory.getBean("chinese") == beanFactory.getBean("chinese"));

	}

}
