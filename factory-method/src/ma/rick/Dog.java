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
public class Dog implements Being{
	private String msg;
	public void setMsg(String msg){
		System.out.println("Dog->setMsg()被调用...");
		this.msg =msg;
	}

	/**
	 *
	 */
	@Override
	public void testBeing(){
		System.out.println("Messsage:"+ msg + ", 狗爱啃骨头");
	}
}
