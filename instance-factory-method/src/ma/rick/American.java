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
public class American implements Person {
	 

	private int age;
	public American() {
		System.out.println("American() 构造函数，Spring实例化主调Bean：American实例 ...");
	}

	@Override
	public void sayHelloTo(String name) {
		 System.out.println( "Hello"+ name +"! "+ " I am American, "+ age +"years old. ");
	}

	@Override
	public void sayGoodbyeTo(String name) { 
		 System.out.println("American, "+ age +" years old. " + "Goodbye,"+ name +"!");
	}

	public void setAge(int age) {
		 System.out.println( "American has age!");
		this.age = age;
	}
 
	
}
