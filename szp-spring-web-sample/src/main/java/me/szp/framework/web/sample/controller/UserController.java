package me.szp.framework.web.sample.controller;

import lombok.extern.slf4j.Slf4j;
import me.szp.framework.spring.core.annotation.Autowired;
import me.szp.framework.spring.core.annotation.Controller;
import me.szp.framework.spring.web.annotation.RequestMapping;
import me.szp.framework.spring.web.annotation.RequestMethod;
import me.szp.framework.spring.web.annotation.RequestParam;
import me.szp.framework.web.sample.entity.User;
import me.szp.framework.web.sample.service.UserService;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/10 12:27
 */
@Controller
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String login (@RequestParam("username") String username,@RequestParam("password") String password) {
        User login = userService.login(username, password);
        if (login!=null) {
            log.info("登陆成功");
        }
        return "登陆成功";
    }



}
