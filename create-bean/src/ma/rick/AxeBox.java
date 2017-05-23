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
public class AxeBox {

	public AxeBox() {
		System.out.println("AxeBox()构造函数，Spring实例化主调Bean：AxeBox实例 ...");
	}

	//非静态工厂方法
	public Axe gainAxeInstance() {
		System.out.println("gainAxeInstance()函数，每次创建一个新的Axe实例 ...");
		return new Axe();
	}

}
