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
public class Australian implements Person {

	private String name;
	private Car car;

	private int times = 0;

	public Australian() {
		System.out.println("Australian:构造函数Australian()");
	}

	public Australian(String name) {
		System.out.println("Australian:构造函数Australian(String name=" + name + ")");
		this.name = name;
	}

	public Australian(String name, Car car) {
		System.out.println("Australian:构造函数Australian(String name, Car car)");
		this.name = name;
		this.car = car;
	}

	public void setName(String name) {
		System.out.println("Australian:设置属性setName(String name=" + name + ")");
		this.name = name;
	}

	public void sayHi() {
		System.out.print("Australian:sayHi()>>  Hi, My name is " + this.name
			+ ". Australian:sayHi()>>  Hi, 第" + (++times) + "次驾驶。");
		if (times == 1) {
			System.out.println("派出一位新司机。");
		} else {
			System.out.println("老司机。");
		}

	}

	@Override
	public void driveMyCar() {
		sayHi();
		System.out.print("Australian:driveMyCar()>>  Drive my car！>>> ");
		this.car.Run();
	}

	public void setCar(Car car) {
		System.out.println("Australian:设置属性setCar(Car " + car.name + ")");
		this.car = car;
	}

	public Car getCar() {
		return car;
	}

}
