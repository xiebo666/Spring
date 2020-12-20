package edu.nf.ch18.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Administrator
 * @date 2020/12/9
 */
@Configuration
@ComponentScan(basePackages = "edu.nf.ch18")
//启用Aop注解处理器，等同与xml中的<aop:aspectj-autoproxy/>
//proxyTargetClass双属性表示是否强制使用cglib动态代理
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {

}