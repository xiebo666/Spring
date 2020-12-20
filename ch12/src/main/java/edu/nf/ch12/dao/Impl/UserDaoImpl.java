package edu.nf.ch12.dao.Impl;

import edu.nf.ch12.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @date 2020/12/4
 */

public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("Smg");
    }

    public void init(){
        System.out.println("asdas");
    }

    public void destroy(){
        System.out.println("asdasdas");
    }
}