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
public class HelloImpl3 implements HelloApi {

	private String message;
	private int index;
//@java.beans.ConstructorProperties({"message", "index"})  

	public HelloImpl3(String message, int index) {
		this.message = message;
		this.index = index;
	}

	@Override
	public void sayHello() {
		System.out.println(index + ":" + message);
	}
}
