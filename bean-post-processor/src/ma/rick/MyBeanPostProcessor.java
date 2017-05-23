/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author Administrator
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean后处理器,在初始化之前postProcessBeforeInitialization，"
			+ "对" + beanName + "进行增强处理...");
		//返回处理后的bean实例
		//该bean就是容器中实际使用的bean实例
		//该bean实例甚至可以与原来的bean截然不同
		if (bean instanceof Man) {
			Man man = (Man) bean;
			man.setName("地球人#" + man.getName());
		} else {
			System.out.println("Bean(" + beanName + ")is not a man...");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Bean后处理器,在初始化之后postProcessAfterInitialization，"
			+ "对" + beanName + "进行增强处理...");
		if (bean instanceof Man) {
			Man man = (Man) bean;
			man.setName(man.getName() + "#真棒");
		}else {
			System.out.println("Bean(" + beanName + ")不是人...");
		}
		return bean;

	}

}
