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
public class Printer {

	private int counter = 0;

	public void print(String type) {
		System.out.println(type + " printer: " + counter++);
	}
}
