package com.javalab3.lab3.lab.z2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RespStringBuilder {

   

    public static String build(String s){
        Matcher m = Pattern.compile("([0-9]{1,3}[\\.]){3}[0-9]{1,3}").matcher(s);
        while(m.find()){
            s = s.replace(m.group(), "${"+m.group()+"}");
            

        }
        return s;
    }    
}
