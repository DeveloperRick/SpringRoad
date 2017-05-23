/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick.merge;

import java.util.Properties;

/**
 *
 * @author Administrator
 */
public class AddressBook {
	
	private Properties emails;

	public void setEmails(Properties emails) {
		this.emails = emails;
	}
	
	public void displayEmails(){
		System.out.println(emails);
	}
	
}
