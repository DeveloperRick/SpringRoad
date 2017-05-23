/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Administrator
 */
public class Run {

	public static void main(String args[]) {
		System.out.println();
		AbstractApplicationContext aac, aacd; //AbstractApplicationContext才可以注册钩子
		System.out.println("☆☆☆☆Init方法在容器初始化之后马上执行☆☆☆☆");
		aac = new ClassPathXmlApplicationContext("ma/rick/SpringXMLConfig.xml");
		System.out.println("☆☆☆☆ClassPathXmlApplicationContext容器初始化完成☆☆☆☆"); 
		System.out.println();
		Chinese z = (Chinese) aac.getBean("zhang");
		System.out.println("☆☆getBean(\"zhang\")完成☆☆");
		System.out.println();
		z.sayHi();
		System.out.println();
		//
		System.out.println("☆○☆○准备getBean(\"qiang\")○☆○☆");
		Person q = (Person) aac.getBean("qiang");
		System.out.println("☆○☆○getBean(\"qiang\")完成○☆○☆");
		System.out.println();
		//
		System.out.println("☆☆设置钩子关闭容器registerShutdownHook()☆☆");
		aac.registerShutdownHook();//钩子执行与注册位置无关
		System.out.println();
		//
		System.out.println("getBean(\"ma\")).sayHi()第一次");
		((Chinese) aac.getBean("ma")).sayHi();
		System.out.println("getBean(\"ma\")).sayHi()第二次");
		((Chinese) aac.getBean("ma")).sayHi();
		System.out.println();
		//
		aacd = new ClassPathXmlApplicationContext("ma/rick/SpringXMLConfig_default.xml");
		System.out.println("_default.xml>>>getBean(\"qian\")类型：Person");
		((Person)aacd.getBean("qian")).sayHi();
		System.out.println();
		System.out.println("_default.xml>>>getBean(\"zhao\").sayHi()类型：Chinese ☆注意顺序☆");
		((Person) aacd.getBean("zhao")).sayHi();
		System.out.println();
		//		
		System.out.println("main代码最后一句，容器即将销毁?");
	}
}
