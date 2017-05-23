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
public class Go {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ma/rick/FieldRetrievingFactoryBean.xml");
		// 调用类或对象的Filed值：使用FiledRetrievingFactoryBean
		
		
	}
	
}
