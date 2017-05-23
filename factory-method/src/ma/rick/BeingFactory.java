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
public class BeingFactory {

	public static Being getBeing(String arg) {
		if (arg.equalsIgnoreCase("dog")) {
			return new Dog();
		} else {
			return new Cat();
		}
	}
}
