package edu.nf.ch09.controll;

import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * @author Administrator
 * @date 2020/12/3
 */
//使用Component注解标识类，表示为容器受管理的Bean
//value属性用于指定Bean的id，如果不知道，默认就是类名
//将首字母变为小写后作为id

    //从3.0后开始，每个层都有对应的注解来表示，作用和@Component注解时一样的，这样标识起来更加明确
@Controller("controller")
public class UserController {
    @Autowired
    //通过@Qualifier指定Bean的id
    //@Qualifier("userService")
    //通过字段注入



    //也可以使用@Resource注解来注入，它是javax包下提供额注解
    //Spring可以支持此注解，name指定要注入的Bean的id
    //但这个注解只能标注在字段以及set方法上，不能标注在构造方法上
    //    @Resource(name = "stuService")
    private UserService service;

    //注入service对象
    //@Autowired注解用于完成注入配置，可以标识在set方法上，构造方法
    //上、字段上
    //注意:当实现类只有一个的时候，Spring会自动找到他并直接注入进来
    //如果有多个实现类的时候，先根据变量名称作为id从容器中查找
    // ，如果匹配的到，则直接返回,匹配不到则抛出有多个实现类的异常
    // 此时就必须结合
    //@Qualifier注解一起使用，这个注解的作用是
    //指定要注入哪一个实现类
    //

    //构造方法注入
//    public UserController(UserService service) {
//        this.service = service;
//    }

    //set方法注入
    public void setService(UserService service) {
        this.service = service;
    }

    public void add(){
        service.add();
    }

    //@PostConstruct注解标识自定义的初始化方法
    @PostConstruct
    public void init(){
        System.out.println("执行自定义的init方法");
    }

    // @PreDestroy注解标识只能给自定义的销毁方法
    @PreDestroy
    public void destory(){
        System.out.println("执行自定义的destory方法");
    }

}