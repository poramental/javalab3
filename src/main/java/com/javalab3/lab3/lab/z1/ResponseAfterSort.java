package com.javalab3.lab3.lab.z1;

import java.util.List;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
public class ResponseAfterSort {
    
    List<String> byLength;
    List<String> byCharCounts;
}
