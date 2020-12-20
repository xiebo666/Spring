package edu.nf.ch17.service.Impl;

import edu.nf.ch17.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @date 2020/12/8
 */

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String save(String name) {
        System.out.println("insert into stu_info values("+name+")");
        return null;
    }
}