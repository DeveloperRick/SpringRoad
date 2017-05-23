/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

/**
 *
 * @author M
 */
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

//@Configuration   
@Configuration("ctxConfig")
public class ApplicationContextConfig {

	//@Bean  
	// 使用@Bean注解的方法不能是private、final或static的。
	@Bean(name = {},
		autowire = Autowire.NO,
		initMethod = "",
		destroyMethod = "")
	public String message() {
		return "hello";
	}

	//依赖注入
	@Bean
	public HelloApi helloImpl3() {
		//通过构造器注入,分别是引用注入（message()）和常量注入（1）  
		return new HelloImpl3(message(), 1);
	}

	//setter注入
	@Bean
	public HelloApi helloImpl4() {
		HelloImpl4 helloImpl4 = new HelloImpl4();//测试Bean
		//通过setter注入注入引用  
		helloImpl4.setMessage(message());
		//通过setter注入注入常量  
		helloImpl4.setIndex(1);
		return helloImpl4;
	}

	//方法注入
	@Bean
	@Scope("singleton")
	public HelloApi helloApi2() {
		HelloImpl5 helloImpl5 = new HelloImpl5() {
			@Override
			public Printer createPrototypePrinter() {
				//方法注入，注入原型Bean  
				return prototypePrinter();
			}

			@Override
			public Printer createSingletonPrinter() {
				//方法注入，注入单例Bean  
				return singletonPrinter();
			}
		};
		//依赖注入,注入单例Bean  
		helloImpl5.setPrinter(singletonPrinter());
		return helloImpl5;
	}

	@Bean
	@Scope(value = "prototype")
	public Printer prototypePrinter() {
		return new Printer();
	}

	@Bean
	@Scope(value = "singleton")
	public Printer singletonPrinter() {
		return new Printer();
	}
}
