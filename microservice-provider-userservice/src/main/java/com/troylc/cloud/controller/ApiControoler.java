package com.troylc.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by troylc on 2017/3/1.
 */
@Controller
public class ApiControoler {
    /**
     * 在服务注册中心点击该服务重定向到api接口中心
     *
     * @return
     */
    @ApiIgnore
    @GetMapping("/usersApi")
    public String redirectApi() {
        return "redirect:/swagger-ui.html";
    }
}
