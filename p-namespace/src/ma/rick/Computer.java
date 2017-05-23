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
public class Computer {

	private Host host;
	private Display display;
	//电脑运行方法
	private String brand;

	public void run() {
		System.out.println("你好，我是"+brand+"电脑，正在运行！");
		System.out.print("   " + host.run() + ",");
		System.out.println(display.run());
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}
}
