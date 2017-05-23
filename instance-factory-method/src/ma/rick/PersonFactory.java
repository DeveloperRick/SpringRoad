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
public class PersonFactory {

	//not static
	public Person gainPerson(String ethnic) {

		if (ethnic.equals("chinese")) {
			return new Chinese();
		} else {
			return new American();
		}

	}

}
