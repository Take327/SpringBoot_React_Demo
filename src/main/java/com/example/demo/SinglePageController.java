package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinglePageController {
	//すべてのPathのGetリクエストでSPAを返却する
	@GetMapping("/**/{path:[^.]*}")
    public String any() {
        return "forward:/index.html";
    }
	
}
