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
public class Car {
	
	private int times=0;
	public String name;

	public Car() {
		System.out.println("Car:构造函数Car()");
	}
	
	public void Run(){
		System.out.print("Car:Run(),RUN!! name:"+name+", 第"+ (++times) +"次奔跑。"   );
		if (times == 1) {
			System.out.println("开出一辆新车。");
		}else{
			System.out.println("旧车。");
		}

	}

	public void setName(String name) {
		System.out.println("Car:设置属性setName(String name=" + name + ")");
		this.name = name;
	}
	
}
