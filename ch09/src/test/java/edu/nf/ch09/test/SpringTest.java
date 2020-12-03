package edu.nf.ch09.test;

import edu.nf.ch09.controll.UserController;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/3
 */
public class SpringTest {

    @Test
    public void testIoc(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserController Controller = context.getBean("controller", UserController.class);
        Controller.add();
    }
}