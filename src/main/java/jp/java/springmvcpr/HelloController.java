package jp.java.springmvcpr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hw")
    public String sayHello() {
        return "Hello World";
    }
}
