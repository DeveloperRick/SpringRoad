/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.w3c.dom.Element;  
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;

/**
 *
 * @author M
 */
public class MyBeanDefinitionParser extends AbstractSingleBeanDefinitionParser{
	  private Class<?> beanClass;  
  
    public MyBeanDefinitionParser(Class<?> beanClass) {  
        this.beanClass = beanClass;  
    }  
  
    @SuppressWarnings("rawtypes")  
    protected Class getBeanClass(Element element) {  
        return beanClass;  
    }  
      
    protected void doParse(Element element, BeanDefinitionBuilder bean) {  
        String orderId = element.getAttribute("orderId");  
        bean.addPropertyValue("orderId", orderId);  
  
        String userId = element.getAttribute("userId");  
        bean.addPropertyValue("userId", Integer.valueOf(userId));  
    }  
}
