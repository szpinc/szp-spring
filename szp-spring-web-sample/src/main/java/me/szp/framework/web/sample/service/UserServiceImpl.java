package me.szp.framework.web.sample.service;

import me.szp.framework.spring.core.annotation.Autowired;
import me.szp.framework.web.sample.entity.User;
import me.szp.framework.web.sample.mapper.UserMapper;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 12:25
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        return userMapper.queryUser(username,password);
    }
}
