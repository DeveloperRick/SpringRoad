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

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/beans.xml");
		System.out.println("------------------容器准备完毕。-----------------------");
		Baby b = (Baby) ac.getBean("id007");
		b.sayHi();
		//配置了id和name. 通过name getBean但是set里面给的是id
		//id优先
		Baby b7 = (Baby) ac.getBean("name007");
		
		b7.sayHi();
		Baby b8 = (Baby) ac.getBean("name008");
		b8.sayHi();

	}

}
