/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;
 
import org.springframework.context.ApplicationEvent;

/**
 *
 * @author M
 */
public class EmailEvent extends ApplicationEvent {

	String address;
	String text;

	public EmailEvent( ) {		 
		super("");
		this.address="";
		this.text="";			 
		 
	}
	public EmailEvent(Object source) {
		super(source);
	}

	public EmailEvent(Object source, String address, String text) {
		super(source);
		this.address = address;
		this.text = text;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setSource(Object source) {
		this.source = source;
	}

}
