/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

/**
 *
 * @author Administrator
 */
public class Cat {
	
	private Axe axe;
	private int age;
	
	public Cat() {
		System.out.println("Cat() 构造函数，Spring实例化主调Bean：Cat实例 ...");
	}
	public void setAxe(Axe axe) {	
		System.out.println("Cat has Axe, too...");	
		this.axe = axe;
	}
	public void setAge(int age) {
		System.out.println("Cat has age, too");
		this.age = age;
	}

	public void useAxe() {
		System.out.println("Cat也可以chop()!, I am a cat, "+ age + " years old.");
		axe.chop();
	}
}
