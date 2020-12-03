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

@Service("classService")
@Primary
public class ClassServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void add() {
        System.out.println("钟煌sB");
        userDao.save();
    }
}