package com.javalab3.lab3.lab.z3;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("z3")
public class Z3Controller {
    
    @GetMapping()
    public String getZ3(){
        return "z3";
    }


    @PostMapping()
    public String postZ3(@RequestParam("reqstring") String reqstring, Model model){
        List<Double> list = new ArrayList<>();
        String[] stringItems = reqstring.split("\n");
        HeapSort sorter = new HeapSort();
        for(int i = 0; i < stringItems.length; i++){
            try{
                list.add(Double.parseDouble(stringItems[i]));
                
            }catch(Exception e){
                System.out.println(e.getMessage());

            }
            
        }
        sorter.sort(list);

        model.addAttribute("list", list);

        return "z3Resp";
    }
}
