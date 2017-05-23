/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick.generics;

import java.util.Map;

/**
 *
 * @author M
 */
public class Bookshelf {
	
	//集合属性指定泛型 Spring会将key value自动转换成相应类型
	private Map<String,Double> prices;

	public void setPrices(Map<String,Double> prices) {
		this.prices = prices;
	}
	
	public void displayPrices(){
		System.out.println(this.prices);
	}
}
