package edu.nf.ch21.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/**
 * @author Administrator
 * @date 2020/12/9
 */
@Configuration
@ComponentScan(basePackages = "edu.nf.ch21")
//启用定时任务注解处理器
@EnableScheduling
/**
 * 可以通过实现SchedulingConfigurer接口来配置线程池
 */
public class AppConfig implements SchedulingConfigurer {

    /**
     * 装配一个定时任务线程池
     * @return  shutdown释放线程池
     */
    @Bean(destroyMethod = "shutdown")
    public ThreadPoolTaskScheduler taskScheduler(){
        ThreadPoolTaskScheduler poolTaskScheduler = new ThreadPoolTaskScheduler();
        //设置线程池大小
        poolTaskScheduler.setPoolSize(2);
        //设置线程名称的前缀
        poolTaskScheduler.setThreadNamePrefix("傻逼钟煌:");
        return poolTaskScheduler;
    }

    /**
     * 配置定时任务，设置线程池
     * @param scheduledTaskRegistrar
     */
    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        //注册定时任务先踩踩踩
        scheduledTaskRegistrar.setScheduler(taskScheduler());
    }
}