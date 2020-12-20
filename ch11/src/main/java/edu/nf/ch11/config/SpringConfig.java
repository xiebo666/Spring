package edu.nf.ch11.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 * @date 2020/12/4
 * 自定义配置类，用于取代xml配置文件
 * 配置来必须使用@Configuration注解标识
 */
@Configuration
/**
 * @ConponentScan注解用于扫描指定的包
 * basePackages属性可以指定多个包路径
 */
@ComponentScan(basePackages = {"edu.nf.ch11"})
public class SpringConfig {

}