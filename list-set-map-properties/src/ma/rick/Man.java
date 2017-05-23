/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
/**
 *
 * @author Administrator
 */
public class Man {
	private List schools;
	private Map scores;
	//Properties类型的Key和Value都只能是String
	private Properties health;
	private Set dogs;
	private String[] books;

	public Man() {
		System.out.println("Spring实例化Bean，构造函数Man()，Man实例...");
	}
	
	public void setSchools(List schools) {
		this.schools = schools;
	}

	public void setScores(Map scores) {
		this.scores = scores;
	}

	public void setHealth(Properties health) {
		this.health = health;
	}

	 
	public void setDogs(Set dogs) {
		this.dogs = dogs;
	}
	

	public void setBooks(String[] books) {
		this.books = books;
	}

 public void test(){
	 System.out.println(schools);
	 System.out.println(scores);
	 System.out.println(health);
	 System.out.println(dogs);
	 System.out.println(Arrays.toString(books));
 }

	
}
