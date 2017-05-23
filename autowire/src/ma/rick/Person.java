/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

/**
 *
 * @author Administrator
 */
public class Person {

	private Book book;

	public Person() {

	}

	public Person(Book book) {
		this.book = book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String toString() {
		return "I'm  a person  I want  to  read  a book   " + book;
	}

}
