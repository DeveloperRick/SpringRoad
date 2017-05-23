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
public class Person {

	private String name;
	
	public Person() {
		System.out.println("Person()构造函数");
	}

	public void myInit() {
		System.out.println("Person::myInit()");

	}

	public void myDestroy() {
		System.out.println("Person::myDestroy()");

	}

	public String getName() {
		return name;
	}

	public void sayHi(){
		
		System.out.println("Person::sayHi(),My name is:" + getName());
		
	}
	public void setName(String name) {	
		System.out.println("Person::setName()");
		this.name = name;
	}
}
