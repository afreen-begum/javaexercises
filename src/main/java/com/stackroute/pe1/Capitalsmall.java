package com.stackroute.pe1;import java.util.*;
public class Capitalsmall {
    public static void main(String[] args) {
        System.out.println("Enter Character");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        int x = (int)ch;
        if (x >= 65 && x <= 90) {
            System.out.println("Capital Letter");
        } else {
            System.out.println("Small Letter");
        }
    }
}
