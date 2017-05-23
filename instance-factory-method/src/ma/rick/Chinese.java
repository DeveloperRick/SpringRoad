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
public class Chinese implements Person {

	public Chinese() {
		System.out.println("Chinese() 构造函数，Spring实例化主调Bean：Chinese实例 ...");
	}

	@Override
	public void sayHelloTo(String name) {
		System.out.println(name + ", 你好!");
	}

	@Override
	public void sayGoodbyeTo(String name) {
		System.out.println(name + ", 再见!");
	}

}
