/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Administrator
 */
public class MainNGTest {
	
	public MainNGTest() {
	}

	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		Main.main(args);
		// TODO 检查生成的测试代码并删除失败的默认调用。
		fail("\u6d4b\u8bd5\u7528\u4f8b\u4e3a\u539f\u578b\u3002");
	}
	
}
