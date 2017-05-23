/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.FactoryBean;

/**
 *
 * @author M
 */
public class PersonFactory implements FactoryBean {

	String p = null;

	@Override
	public Object getObject() throws Exception {
		if (null == p) {
			p = new String("Rick");
		}
		return p;

	}

	@Override
	public Class getObjectType() {
		return String.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

}
