/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 *
 * @author Administrator
 */
public class Chinese implements BeanFactoryAware{
    private BeanFactory factory;

    @Override
    public void setBeanFactory(BeanFactory bf) throws BeansException {
       
        this.factory=bf;
        
    }
    
    public BeanFactory gainMyFactoryInstance(){
        return factory;
    }
    
}
