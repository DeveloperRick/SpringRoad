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
public class Schoolchild extends Child{
	
	private Child captain=new Child(); //

	public void setCaptain(Child captain) {
		this.captain = captain;
	}
	
	public Child getCaptain() {
		return captain;
	}
	

	
	
}
