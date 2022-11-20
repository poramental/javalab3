package com.javalab3.lab3.lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
    

    @GetMapping(value="/")
    public String getMethodName() {
        return "main";
    }
    
}
