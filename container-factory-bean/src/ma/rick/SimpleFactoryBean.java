/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.rick;

import java.util.Date;
import org.springframework.beans.factory.FactoryBean;

/**
 *
 * @author M
 */
public class SimpleFactoryBean implements FactoryBean {  
        private boolean flag;  
      
        public Object getObject() throws Exception {  
            if (flag) {  
                return new Date();  
            }  
            return new String("false");  
        }  
      
        @SuppressWarnings("unchecked")  
        public Class getObjectType() {  
            return flag ? Date.class : String.class;  
        }  
      
        public boolean isSingleton() {  
            return false;  
        }  
      
        public void setFlag(boolean flag) {  
            this.flag = flag;  
        }  
    }  
