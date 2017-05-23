/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.BeansException; 
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author Administrator
 */
public class English implements ApplicationContextAware {

	private ApplicationContext ac;

	public ApplicationContext gainMyApplicationContextFactoryInstance() {
		return ac;
	}

	@Override
	public void setApplicationContext(ApplicationContext ac) throws BeansException {
		this.ac = ac;
	}

}
