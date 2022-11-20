package com.javalab3.lab3.lab.z1;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;







@Controller
public class Z1Controller {

    
    @GetMapping(value="/z1")
    public String Z1get(){
        
        return "z1";
    }

    @PutMapping(value="/z1")
    public String Z1post(@RequestParam("reqstring") String string, Model model) {
        RequestList reqList = new RequestList();
        model.addAttribute("requestList", reqList);

        return "redirect:/z1Resp";
    }
    
    
}
