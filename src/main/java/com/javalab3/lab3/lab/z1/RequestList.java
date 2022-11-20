package com.javalab3.lab3.lab.z1;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RequestList {
    List<String> list;

    public void add(String s){
        list.add(s);
    }
}
