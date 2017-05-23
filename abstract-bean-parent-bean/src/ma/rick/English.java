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
public class English implements Person {
	private Axe axe;

	public English() {
		System.out.println("English() 构造函数，Spring实例化主调Bean：English实例 ...");
	}
	@Override
	public void useAxe() {
		System.out.println("useAxe() ，English use Axe...");
		 axe.chop();
	}

	public void setAxe(Axe axe) {
		System.out.println("setAxe(Axe axe)，Spring执行依赖注入English的Axe...");
		this.axe = axe;
	}
	
}
