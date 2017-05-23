/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.BeanNameAware;

/**
 *
 * @author M
 */
public class Baby implements BeanNameAware {

	String beanName;

	@Override
	public void setBeanName(String string) {
		this.beanName = string;
	}
	
	public void sayHi(){
		System.out.println("Hi, my BeanName is "+ this.beanName);
	}

}
