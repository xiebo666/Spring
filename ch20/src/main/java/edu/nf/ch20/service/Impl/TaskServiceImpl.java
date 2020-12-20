package edu.nf.ch20.service.Impl;

import edu.nf.ch20.service.TaskService;

/**
 * @author Administrator
 * @date 2020/12/9
 */
public class TaskServiceImpl implements TaskService {
    @Override
    public void backup() {
        System.out.println(Thread.currentThread().getName()+"执行备份");
    }

    @Override
    public void clean() {
        System.out.println(Thread.currentThread().getName()+"执行清理");
    }
}