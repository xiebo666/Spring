package edu.nf.ch18.test;

import edu.nf.ch18.config.SpringConfig;
import edu.nf.ch18.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Administrator
 * @date 2020/12/9
 */
public class SpringTest {
    @Test
    public void testAop(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService service = context.getBean("userService",UserService.class);
        service.save("asdasdas");
    }
}