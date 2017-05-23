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
public class StoneAxe implements Axe {

	public StoneAxe() {
		System.out.println("StoneAxe() 构造函数，Spring实例化主调Bean：StoneAxe实例 ...");
	}

	@Override
	public void chop() {
		 System.out.println("chop()，Stone Axe在砍柴");
	}
	
}
