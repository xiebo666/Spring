package edu.nf.ch04;

/**
 * @author Administrator
 * @date 2020/12/1
 */
public class People {
    public People(){
        System.out.println("执行了构造方法");
    }

    /**
     * bean初始化方法，注意：是在对象创建之前执行
     */
    public void init(){
        System.out.println("执行Bean的init方法");
    }

    /**
     * bean的销毁方法，注意：是在销毁之前执行
     */
    public void destroy(){
        System.out.println("执行Bean的destroy方法");
    }

    public void say(){
        System.out.println("gg");
    }
}