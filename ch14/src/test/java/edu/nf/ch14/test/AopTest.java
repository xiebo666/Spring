package edu.nf.ch14.test;

import edu.nf.ch14.service.StuService;
import edu.nf.ch14.service.UserSerivce;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.ws.Service;

/**
 * @author Administrator
 * @date 2020/12/7
 * jdk动态代理
 */
public class AopTest {
    @Test
    public void testAop(){
        //初始化容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器中获取创建的代理实例
        UserSerivce serivce = context.getBean("userServiceProxy", UserSerivce.class);
        serivce.add();
    }

    /**
     * gblib动态代理
     */
//    @Test
//    public void testAop2(){
//        //初始化容器
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        //从容器中获取创建的代理实例
//        StuService serivce = context.getBean("userServiceProxy", StuService.class);
//        serivce.add();
//    }
}