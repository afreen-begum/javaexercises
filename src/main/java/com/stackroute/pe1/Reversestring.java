package com.stackroute.pe1;

import java.util.*;
public class Reversestring{
    public static void main(String[] args){
        String x="";
        Scanner sc = new Scanner(System.in);
        String g = sc.next();
        for(int j=g.length()-1;j>=0;j--){
            x=x+g.charAt(j);
        }
        System.out.println(x);
    }
}