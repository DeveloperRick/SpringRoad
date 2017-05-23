/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import ma.rick.Run;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author M
 */
public class MainNGTest {

	static ApplicationContext ac;
	static Operator ae0, ae1;
	static Run run;

	@Test
	public void testDoCDUQ() {
		run.doCDUQ(ae0);
		System.out.println("--------------------------");
		run.doCDUQ(ae1);
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
		ac = new ClassPathXmlApplicationContext("ma/rick/config.xml");
		System.out.println("--------------------------");
		run=new Run();
		
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
	}

	@BeforeMethod
	public void setUpMethod() throws Exception {
		ae0 = (Operator) ac.getBean("commonOperator");
		System.out.println("--------------------------");
		ae1 = (Operator) ac.getBean("newOperator");
		System.out.println("--------------------------");
	}

	@AfterMethod
	public void tearDownMethod() throws Exception {
	}
}
