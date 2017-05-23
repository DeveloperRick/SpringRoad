/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 *
 * @author M
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		registerBeanDefinitionParser("or", new MyBeanDefinitionParser(
			Order.class));
	}
}
