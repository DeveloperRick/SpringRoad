/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author M
 */
public class Cat implements BeanNameAware, InitializingBean {

	String beanName;

	@Override
	public void setBeanName(String string) {
		System.out.println("回调方法setBeanName()...");
		this.beanName = string;
	}

	public void sayHi() {
		System.out.println("Init  in configuration Xml:： my BeanName is " + this.beanName);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()...");
	}

}
