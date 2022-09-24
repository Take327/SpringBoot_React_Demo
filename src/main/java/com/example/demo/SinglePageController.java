package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SinglePageController {
	@GetMapping("/**/{path:[^.]*}")
    public String any() {
        return "forward:/index.html";
    }
	
    // 一番優先される
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public String aaa() {
        return "forward:/index.html";
    }
}
