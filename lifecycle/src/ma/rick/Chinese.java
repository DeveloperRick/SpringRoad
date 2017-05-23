/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author Administrator
 */
//disposable 一次性的，用后就抛弃的; 
public class Chinese extends Person implements InitializingBean, DisposableBean {

	public Chinese() {
		System.out.println("Chinese()构造函数");
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Chinese::InitializingBean::afterPropertiesSet()"
			+ "，Bean初始化之后执行，after properties set");

	}

	@Override
	public void destroy() throws Exception {

		System.out.println("Chinese::DisposableBean::destroy()"
			+ "，Bean销毁之前执行");

	}

	@Override
	public void sayHi() {
		System.out.println("Chinese::sayHi(), This is " + super.getName());
	}

}
