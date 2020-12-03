package edu.nf.ch09.dao.Impl;

import edu.nf.ch09.dao.UserDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 * @date 2020/12/3
 */
//可以使用@Repository注解来标识dao层
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("gg");
    }
}