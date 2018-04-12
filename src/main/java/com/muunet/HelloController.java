package com.muunet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZH on 2018/4/11.
 */
@RestController
public class HelloController {

    @Value("${sso.auth.cookie.domain}")
    private String domain;

    @RequestMapping("/hello")
    public String hello() {
        System.err.println(domain);
        return "Hello,welcome to muunet!";
    }
}
