package edu.nf.ch01.test;

import edu.nf.ch01.People;
import edu.nf.ch01.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/11/30
 *
 *在Spring框架中工厂分俩类，
 * 一种是BeanFactory，另一种是ApplicationContext
 * 简单说，BeanFactory是Spring最基础的bean工厂，
 * 而ApplicationContext针对BeanFactory做了很多的功能扩展和增强
 * 官方推荐我们使用ApplicationContext这个接口来操作Spring容器
 */
public class SpringContainerTest {

    @Test
    public void testGetBean(){
        //初始化spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //从容器中获取bean对象
        //users user = (Users) context.getBean("user");
        //使用泛型获取
        Users user = context.getBean("user",Users.class);
        user.say();
        People people = context.getBean("people",People.class);
        people.run();
    }


    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Users user = context.getBean("users1",Users.class);
        user.say();
    }
}