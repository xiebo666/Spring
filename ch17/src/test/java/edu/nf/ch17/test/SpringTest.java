package edu.nf.ch17.test;

import edu.nf.ch17.aspect.StuServiceAspect;
import edu.nf.ch17.service.Impl.UserServiceImpl;
import edu.nf.ch17.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/8
 */
public class SpringTest {
    @Test
    public void testAop(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.save("SBZt");

    }
}