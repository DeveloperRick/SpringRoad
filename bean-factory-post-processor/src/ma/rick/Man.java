package ma.rick;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
public class Man {
	private String name;

	public Man() {
		System.out.println(" Man() ...");
	}

	public Man(String name) {
		System.out.println(" Man(String name) ...");
		this.name = name;
	}

	public String getName() {
		System.out.println(" getName() ...");
		return name;
	}

	public void setName(String name) {
		System.out.println(" setName(String name="+name+") ...");
		this.name = name;
	}
	
	public void myInit(){
		System.out.println(" 执行初始化方法myInit() ...");	
	}
}
