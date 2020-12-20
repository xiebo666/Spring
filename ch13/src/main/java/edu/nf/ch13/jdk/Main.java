package edu.nf.ch13.jdk;

import edu.nf.ch13.UserService;
import edu.nf.ch13.UserServiceImpl;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 * @date 2020/12/7
 */
public class Main {
    public static void main(String[] args) {
        //创建代理满足的三个必要条件
        //1.创建回调处理器，并传入目标对象
        //InvocationHandler handler = new LogoinvocationHander(new UserServiceImpl());
        InvocationHandler handler = new LogoinvocationHander(new UserServiceImpl());
         //2.获取一个类加载器，用于加载动态创建出来的代理字节码
        //加载成功后将创建出一个代理实例
        ClassLoader loader = Main.class.getClassLoader();
        //3.获取目标对象所实现的接口的class
        Class<?>[]infClasses = UserServiceImpl.class.getInterfaces();
        //使用proxy类来创建代理对象，并且创建出来的代理对象会自动实现上面的接口
        UserService userService =(UserService) Proxy.newProxyInstance(loader,infClasses,handler);
        //调用代理对象
        userService.add();
        userService.update();
        userService.getUser();
    }
}