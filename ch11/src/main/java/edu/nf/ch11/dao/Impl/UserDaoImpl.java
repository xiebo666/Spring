package edu.nf.ch11.dao.Impl;

import edu.nf.ch11.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @date 2020/12/4
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("GG");
    }
    @Override
    public void add2() {
        System.out.println("SB");
    }

    public void init(){
        System.out.println("执行UserDao的init方法");
    }

    public  void destroy(){
        System.out.println("执行UserDao的destroy方法");
    }
}