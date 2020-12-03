package edu.nf.ch09.service.impl;

import edu.nf.ch09.dao.UserDao;
import edu.nf.ch09.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/12/3
 */
@Service("stuService")
//@Primary注解标识在类上，表示游戏注入的bean
//@Primary
public class StuServiceIml implements UserService {
    //注入UserDao
    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("执行StuServiceImpl");
        userDao.save();
    }
}