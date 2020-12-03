package edu.nf.ch03.test;

import edu.nf.ch03.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2020/11/30
 */
public class testIdAndName {

    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people", People.class);
        System.out.println(people);
        People p1 = context.getBean("p1",People.class);
        People p2 = context.getBean("p2",People.class);
        People p3 = context.getBean("p3",People.class);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}