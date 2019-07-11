package com.stackroute.pe1;
import java.util.*;
public class Guessnumber {
    public static void main(String[] args){
        int x=34;
        System.out.println("Guess a Number: ");
        Scanner sc= new Scanner(System.in);
        int input=sc.nextInt();
        if (input >= 1 && input <= 50) {
            if(input==x) {
                System.out.println("The number you entered is "+input+" and is guessed properly");
            }
            else if(input>x) {
                System.out.println("The number you entered is"+input+"and is "+(input-x)+" greater than the original number");
            }
            else if(input<x) {
                System.out.println("The number you entered is"+input+"and is "+(x-input)+" Lesser than the original number");
            }       }
        else {
            System.out.println("Given Number is not in the bounds,give a number that is greater than 1 and less than 50");
        }   }
}

