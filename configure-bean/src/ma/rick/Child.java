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
public class Child {

	private Child friend;
	private String name;

	public Child() {
	}

	public Child(String name) {
		this.name = name;
	}
	
	public Child(Child friend, String name) {
		this.friend = friend;
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setFriend(Child friend) {
		this.friend = friend;
	}
	
	public void whoIsFriend(){
		System.out.println("I am "+ name+", "+friend.name + " is my Friend.");
	}

	public String getName() {
		return name;
	}

}
