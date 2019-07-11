package com.stackroute.pe1;

public class Junitdemo {
    public String concatAndUpperCase(String str1,String str2) {
        if(str1==null || str2==null){
            return("Null Value Not Allowed");
        }
        String concattedString = str1.concat(str2);
        return concattedString.toUpperCase();
    }
public String reverseString(String hello){
        return("olleH");
}
}
