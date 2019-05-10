package me.szp.framework.spring.core.constant;

import me.szp.framework.spring.core.context.FileSystemXmlApplicationContext;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 10:33
 */
public interface Constants {

    String PATH = FileSystemXmlApplicationContext.class.getResource("/").getPath();
    String contextConfigLocation = "application.xml";
    String springmvcConfigLocation = "spring-mvc.xml";
    String mybatisConfigLocation = "MyUserMapper.xml";
}
