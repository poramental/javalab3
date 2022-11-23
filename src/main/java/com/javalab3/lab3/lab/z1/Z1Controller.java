package com.javalab3.lab3.lab.z1;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;







@Controller
public class Z1Controller {

    
    @GetMapping(value="/z1")
    public String Z1get(){
        
        return "z1";
    }

    @PostMapping(value="/z1")
    public String Z1post(@RequestParam("reqstring") String string, Model model) {
        
        
        String[] _list = string.split("\n");
        List<String> list = new ArrayList<>();
        for(int i = 0; i < _list.length; i++ ){
            list.add(_list[i]);
        }
        ResponseAfterSort resp = new ResponseAfterSort();
        resp.setByCharCounts(StringListSorter.sortByCountsOfLowerChars(list));
        resp.setByLength(StringListSorter.sortByLength(list));
        model.addAttribute("resp", resp);
        return "z1Resp";
    }
    

    
}
