package com.springboot.project03;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nick on 16. 8. 21.
 */
@RestController
public class HelloWorld {
    @RequestMapping(value="/hello.do")
    public String index() {
        return "Hello World!! Project03";
    }
}
