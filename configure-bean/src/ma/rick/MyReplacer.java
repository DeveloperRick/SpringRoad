/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

/**
 *
 * @author M
 */
public class MyReplacer implements MethodReplacer{

	/**
	 *
	 * @param o
	 * @param method
	 * @param os
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object reimplement(Object o, Method method, Object[] os) throws Throwable {
 
		Schoolchild s=(Schoolchild)o;
		System.out.println("我是"+ s.getName()+"，"+s.getCaptain().getName() + "是我的班长。");
 
		return null;	
	
	}
	
}
