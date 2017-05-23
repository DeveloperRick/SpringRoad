/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class RunTest {
	
	public RunTest() {
	}
	
	@After
	public void tearDown() {
	}

	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		Run.main(args);
		//fail("The test case is a prototype.");
	}
	
}
