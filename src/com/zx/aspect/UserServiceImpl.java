package com.zx.aspect;

/**
 * @author zhouxuan
 * @date 2020/8/4 14:56
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("add user");
    }

    @Override
    public void delete() {
        System.out.println("delete user");
    }
}
