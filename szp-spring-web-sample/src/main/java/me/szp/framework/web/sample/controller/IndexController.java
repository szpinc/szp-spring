package me.szp.framework.web.sample.controller;

import me.szp.framework.spring.core.annotation.Controller;
import me.szp.framework.spring.web.annotation.RequestMapping;
import me.szp.framework.spring.web.annotation.RequestParam;

/**
 * @author Sun Zhi Peng
 * @version 1.0.0
 * @date 2019/5/9 16:13
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/test")
    public String index(@RequestParam("content") String content) {
        return content;
    }

}
