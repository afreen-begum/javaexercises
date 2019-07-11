package com.stackroute.pe1;
import java.util.*;
public class Conditional{
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner scn=new Scanner(System.in);int x=scn.nextInt();
        if(x>20&&x<30){
            if(x%2==0){
                System.out.println("tom");}
            else{
                System.out.println("jerry");
            }}
    else{
        System.out.println("out of range");
        }
    }}
