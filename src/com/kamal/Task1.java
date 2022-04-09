package com.kamal;

//import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int result = a;
        a =b;
        b = result;
        System.out.println("with third variable, result a:"+a + " b :" + b);
        a = 5;
        b = 10;
        a = a +b;
        b = a - b;
        a = a -b;
        System.out.println("without third variable, a:"+ a+" b:"+b);

    }
}
