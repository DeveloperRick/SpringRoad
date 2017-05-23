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

	public static void main(String args[]) {

		System.out.println("");
		ApplicationContext ac;
		ac = new ClassPathXmlApplicationContext("ma/rick/bean-configuration.xml");
		System.out.println("new ClassPathXmlApplicationContext()，程序已经实例化Factory...");
		Baby p = (Baby) ac.getBean("xiaoming");
		System.out.println("getBean(\"xiaoming\")，程序中已经完成了xiaoming Bean的实例化...");
		p.useAxe();
		System.out.print(" <!--static-->getBean(\"xiaoqiang\")):");
		((Baby) ac.getBean("xiaoqiang")).useAxe();
		System.out.print("<!--static Baby gainInstance(int i)-->getBean(\"daqiang\")):");
		((Baby) ac.getBean("daqiang")).useAxe();
		System.out.print("<!-- static Baby gainInstance(Axe axe) -->getBean(\"xiaogang\")):");
		((Baby) ac.getBean("xiaogang")).useAxe();
		System.out.print("<!--非静态方法--> getBean(\"axe008\")):");
		((Axe) ac.getBean("axe008")).chop();
		System.out.print("<!--非静态方法--> getBean(\"xuanxuan\")):");
		((Baby) ac.getBean("xuanxuan")).useAxe();
		/////////////////
		System.out.println("☆☆☆☆☆");
		System.out.print("<!--非静态方法--> getBean(\"axe008\"):");
		System.out.println(ac.getBean("axe008") == ac.getBean("axe008"));

		System.out.print("<!--非静态方法--> getBean(\"xuanxuan\"):");
		System.out.println(ac.getBean("xuanxuan") == ac.getBean("xuanxuan"));

		System.out.print("<!-- static Baby gainInstance(Axe axe) -->getBean(\"xiaogang\"):");
		System.out.println(ac.getBean("xiaogang") == ac.getBean("xiaogang"));

		System.out.print("<!--static-->(\"daqiang\")(\"guangtouqiang\"):");
		System.out.println(ac.getBean("daqiang") == ac.getBean("guangtouqiang"));

	}

}
