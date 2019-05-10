package me.szp.framework.web.sample.service;

import me.szp.framework.web.sample.entity.User;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 12:24
 */
public interface UserService {

    User login (String username,String password);
}
