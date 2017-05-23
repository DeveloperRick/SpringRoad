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
public class Taxi extends Car {

	public Taxi() {
		System.out.println("Taxi()构造函数...");
	}
	
	
	public void setName(String name) {
		System.out.println("Taxi:设置属性setName(String name=" + name + ")");
		this.name = name;
	}
}
