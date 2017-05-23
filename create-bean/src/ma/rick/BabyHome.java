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
public class BabyHome {

	private Axe axe;
	private static int index;

	public BabyHome() {
		System.out.println("BabyHome() 构造函数，Spring实例化主调Bean：BabyHome实例 ...");
		System.out.println("BabyHome 计数器=>" + index++);
	}

	public Baby getBabyInstance(Axe axe) {
		System.out.println("※※※非静态gainInstance(Axe axe)函数，"
			+ "配置由Spring注入Axe，※※※每次创建一个新的Baby实例 ...");
		Baby c = new Baby();
		c.setAxe(axe);
		return c;
	}

	public static Baby gainInstance(Axe axe) {
		System.out.println("※※※静态gainInstance(Axe axe)函数，"
			+ "配置由Spring注入Axe，※※※每次创建一个新的Baby实例 ...");
		Baby c = new Baby();
		c.setAxe(axe);
		return c;
	}

	public static Baby gainInstance() {
		System.out.println("静态gainInstance()函数，每次创建一个新的Baby实例,新的Axe实例 ...");
		Baby c = new Baby();
		Axe axe = new Axe();
		c.setAxe(axe);

		return c;
	}

	public static Baby gainInstance(int i) {
		System.out.println("静态gainInstance(int=> " + i + ")函数，每次创建一个新的Baby实例,新的Axe实例 ...");
		Baby c = new Baby();
		Axe axe = new Axe();
		c.setAxe(axe);
		return c;
	}
}
