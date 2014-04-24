/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package springbasico;

import com.luis.servicios.ISaludos;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author luis
 */
public class SpringBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BeanFactory bean=
                new ClassPathXmlApplicationContext("/bean.xml");
        
        ISaludos sal=bean.getBean("en3", ISaludos.class);
        sal.saludaTodos();
        //System.out.println(sal.getSaludo());
        
    }
    
}
