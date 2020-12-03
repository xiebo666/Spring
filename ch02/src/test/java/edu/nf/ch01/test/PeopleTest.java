package edu.nf.ch01.test;

import edu.nf.ch02.People;
import edu.nf.ch02.Woman;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/11/30
 */
public class PeopleTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people",People.class);
        People people1 = context.getBean("people",People.class);
        System.out.println(people);
        System.out.println(people1);
    }

    @Test
    public void woManTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Woman woman = context.getBean("woman",Woman.class);
        woman.say();
    }
}