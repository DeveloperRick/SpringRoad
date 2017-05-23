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
	
	public StoneAxe(){}
	
	@Override
	public String chop() {
		return "石斧砍柴好慢。";
	}
	
}
