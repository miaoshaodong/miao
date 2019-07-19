package com.msd.springbootdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldRestController {
    @RequestMapping("/")
    public String helloworld(){
        return "hahahacdsadsa";
    }
}
