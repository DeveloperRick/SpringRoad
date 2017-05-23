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
public class Dog {
	private String name;

	public Dog() {
	}

	public Dog(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Dog{" + "name=" + name + '}';
	}

	public void setName(String name) {
		this.name = name;
	}
}
