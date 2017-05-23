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
public class American extends Chinese {

	private String name;
	public American(){}
	
	public American( Axe axe ){
		
		super(axe);
		this.name="King(Default)";
		
	}
	
	public American( Axe axe,String name){
		
		super(axe);
		this.name=name;
		
	}
	
	@Override
	public void useAxe() {
		System.out.println();
		System.out.println("My name is:" + this.name);
		super.useAxe();
	}
 
	
}
