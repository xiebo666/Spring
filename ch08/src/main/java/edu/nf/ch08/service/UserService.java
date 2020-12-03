package edu.nf.ch08.service;

import edu.nf.ch08.entity.Users;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/12/2
 */
public interface UserService {
    /**
     * 查询用户列表
     * @return
     */
    List<Users> listUser();
}