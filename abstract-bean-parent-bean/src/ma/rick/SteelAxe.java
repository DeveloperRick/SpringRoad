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
public class SteelAxe implements Axe {

	public SteelAxe() {
		System.out.println("SteelAxe()构造函数，Spring实例化主调Bean：SteelAxe实例 ...");
	}

	@Override
	public void chop() {
		 System.out.println("chop()，Steel Axe在砍柴，钢斧子砍得快");
	}
	
}
