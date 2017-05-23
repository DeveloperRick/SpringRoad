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
public class Chinese implements Person {
	private Axe axe;

	public Chinese() {
		System.out.println("Chinese() 构造函数，Spring实例化主调Bean：Chinese实例 ...");
	}
	@Override
	public void useAxe() {
		System.out.println("useAxe() ，Chinese use Axe...");
		 axe.chop();
	}

	public void setAxe(Axe axe) {
		System.out.println("setAxe(Axe axe)，Spring执行依赖注入Chinese的Axe...");
		this.axe = axe;
	}
	
}
