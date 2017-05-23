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
public class Run {
 
	public void doCDUQ(Operator user) {
		user.create();
		user.delete();
		user.update();
		user.query();
	}
	
}
