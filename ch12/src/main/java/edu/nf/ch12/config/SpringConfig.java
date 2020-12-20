package edu.nf.ch12.config;

import edu.nf.ch12.controller.UserController;
import edu.nf.ch12.dao.Impl.UserDaoImpl;
import edu.nf.ch12.dao.UserDao;
import edu.nf.ch12.service.Impl.StuServiceImpl;
import edu.nf.ch12.service.Impl.UserServiceImpl;
import edu.nf.ch12.service.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

/**
 * @author Administrator
 * @date 2020/12/4
 */
@Configuration
//使用配置类同样可以进行扫描
//和配置类使用@Bean注解配置的bean一同纳入到了容器中
@ComponentScan(basePackages = "edu.nf.ch12")
public class SpringConfig {

    /**
     * 装配dao
     * 使用Bean注解来配置
     * 方法名默认就位Bean的id
     * 也可以通过name属性重写自定义
     */

    @Bean(name = "dao",initMethod = "init",destroyMethod = "destroy")
    //@Scope注解也可以声明在方法上
    //@Scope("singleton")
    //@Primary注解也可以标注在方法上，表示优先注入这个bean
    //@Primary
    public UserDao userDao(){
        return  new UserDaoImpl();
    }

    /**
     * 装配service
     */
    @Bean
    public  UserService userService(UserDao userDao){
        UserServiceImpl service = new UserServiceImpl();
        //手动调用set方法进行注入
        //方式一:调用 UserDao的方法获取dao的bean进行注入
        // service.setUserDao(userDao());
        //方式二:通过Spring传进来的参数进行 注入
        service.setUserDao(userDao);
        return service;
    }

    /**
     * 装配StuService
     * @param userDao
     * @return
     */
    @Bean
    public UserService stuService(UserDao userDao){
        StuServiceImpl service = new StuServiceImpl();
        //注入UserDao
        service.setUserDao(userDao);
        return service;
    }

    /**
     * 装配controller
     * 当有多个实现类是，会先根据参数的变量名称作为id到容器中查找
     * 如果找到则直接传入进来注入，找不到则引发异常
     * 因此可以结合@Qualifier注解标识在参数上
     */
    @Bean
    public UserController userController(@Qualifier("stuService") UserService Service){
        UserController controller = new UserController();
        //注入USerService

        controller.setUserService(Service);
        return controller;
    }

}