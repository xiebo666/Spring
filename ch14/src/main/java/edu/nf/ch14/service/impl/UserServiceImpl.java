package edu.nf.ch14.service.impl;

import edu.nf.ch14.service.UserSerivce;

/**
 * @author Administrator
 * @date 2020/12/7
 */
public class UserServiceImpl implements UserSerivce {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }
}