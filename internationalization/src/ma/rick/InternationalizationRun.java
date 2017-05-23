/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import java.util.Date;
import java.util.Locale;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author M
 */
public class InternationalizationRun {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws BeansException {
		System.out.println("Default Locale: "+Locale.getDefault());
		// TODO code application logic here
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ma/rick/I18n-beans.xml");
		printTxt(ctx);
		Locale.setDefault(Locale.CHINA);
		printTxt(ctx);
		Locale.setDefault(Locale.JAPAN);
		printTxt(ctx);
		Locale.setDefault(Locale.US);
		printTxt(ctx);
		 
	}

	private static void printTxt(ApplicationContext ctx) {
		String[] a = {"Tom"};
		Object[] b = {new Date()};
		String hello = ctx.getMessage("hello", a, Locale.getDefault());
		String now = ctx.getMessage("now", b, Locale.getDefault());
		System.out.println();
		System.out.println(hello);
		System.out.println(now);
	}

}
