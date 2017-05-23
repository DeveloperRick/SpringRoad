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
//书上说lookup-method 用于setter()和构造函数？？没整明白
public class RunLookupStructure {
	public static void main(String[] args) {
		System.out.println("=====================================");
		ApplicationContext ac ;
		ac = new ClassPathXmlApplicationContext("ma/rick/Lookup-Structural-injection.xml");
		//	
		System.out.println("=====------------------------=====--------------------------====");
		((Sydneyer)ac.getBean("Bill")).buyCar();
		((Sydneyer)ac.getBean("Gates")).buyCar();
		System.out.println("=====------------------------=====--------------------------====");
 

	}
}
