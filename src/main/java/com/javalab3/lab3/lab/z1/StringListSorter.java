package com.javalab3.lab3.lab.z1;

import java.util.Comparator;
import java.util.List;





public class StringListSorter {

    
    
    public static List<String> sortByLength(List<String> list) {
        list.sort(StringByLengthComparator);
        return list;
    }

    public static List<String> sortByCountsOfLowerChars(List<String> list){
        list.sort(StringByCountsOfLowerCharsComparator);
        return list;
    }

    public static int countsOfLowerChars(String s){
        int count = 0;
        for(char c : s.toCharArray()){
            if(Character.isLowerCase(c)) count++;
        }
        return count;
    }

    public static Comparator<String> StringByLengthComparator = new Comparator<String>(){
        @Override
        public int compare(String s1, String s2){
            return s1.length() - s2.length();
        }

    };

    public static Comparator<String> StringByCountsOfLowerCharsComparator = new Comparator<String>(){
        @Override
        public int compare(String s1, String s2){
            return countsOfLowerChars(s1) - countsOfLowerChars(s2);
        }

    };


}
