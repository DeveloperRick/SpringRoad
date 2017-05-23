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
	
	public Chinese(){}
	
	public Chinese(Axe axe){
		this.axe=axe;
	}
	
	@Override
	public void useAxe() {
		 System.out.println(axe.chop());
	}

	public void setAxe(Axe axe) {
		this.axe = axe;
	}
	
}
