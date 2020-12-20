package edu.nf.ch15.service.Impl;

import edu.nf.ch15.service.UserService;

/**
 * @author Administrator
 * @date 2020/12/8
 */
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户");
    }
}