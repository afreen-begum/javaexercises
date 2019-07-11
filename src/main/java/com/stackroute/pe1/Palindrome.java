package com.stackroute.pe1;

import java.util.*;
public class Palindrome {
    public static void main(String args[]){
        int x=0,sum=0,temp,rem;
        System.out.println("Enter Number :");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();       temp=n;
        while(n>0){
            rem=n%10;
            if(rem%2==0){
                x=x+rem;
            }
            sum=(sum*10)+rem;
            n=n/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else{
            System.out.println("not palindrome");}
        System.out.println(x);
    }
}
