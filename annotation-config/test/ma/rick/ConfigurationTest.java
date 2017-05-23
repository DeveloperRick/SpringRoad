package ma.rick;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import ma.rick.HelloApi;
import ma.rick.ApplicationContextConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;

import org.testng.annotations.Test;

/**
 *
 * @author M
 */
public class ConfigurationTest {

	@Test
	public void testHelloworld() {
		AnnotationConfigApplicationContext ctx;
		ctx = new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		Assert.assertEquals("hello", ctx.getBean("message"));

		ctx.getBean("helloImpl3", HelloApi.class).sayHello();
		ctx.getBean("helloImpl4", HelloApi.class).sayHello();
		System.out.println("=======prototype sayHello======");
		
		HelloApi helloApi2 = ctx.getBean("helloApi2", HelloApi.class);
		helloApi2.sayHello();
		helloApi2 = ctx.getBean("helloApi2", HelloApi.class);
		helloApi2.sayHello();
	}
}
