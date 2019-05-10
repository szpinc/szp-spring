package me.szp.framework.web.sample.mapper;

import me.szp.framework.web.sample.entity.User;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 12:22
 */
public interface UserMapper {
    User queryUser(String userName, String passWord);
}
