package jp.java.springmvcpr.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, Model model) {
        String name = request.getParameter("name");
        //System.out.println("Hello " + name);

        model.addAttribute("massage", "Hello "+name);
        return "first/hello";
    }

    @GetMapping("/bb")
    public String bbPage(){
        return "first/bb";
    }
}
