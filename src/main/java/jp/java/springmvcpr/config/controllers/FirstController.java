package jp.java.springmvcpr.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";
    }

    @GetMapping("/bb")
    public String bbPage(){
        return "first/bb";
    }
}
