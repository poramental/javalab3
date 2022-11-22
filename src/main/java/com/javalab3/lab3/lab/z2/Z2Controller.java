package com.javalab3.lab3.lab.z2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class Z2Controller {
    
    @GetMapping(value="/z2")
    public String getZ2(){
        return "z2";
    }

    @PostMapping(value = "/z2")
    public String postZ2(@RequestParam("reqstring") String _string, Model model){
        model.addAttribute("_string",RespStringBuilder.build(_string));
        
        return "z2Resp";
    }

    @GetMapping(value = "/z2Resp")
    public String getZ2Resp(){
        return "z2Resp";
    }
}
