package com.kamal;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Please Enter 2 Integers smaller than 10");
        int a = k.nextInt();
        int b = k.nextInt();
        if ((a > 0 && a <=10) && (b > 0 && b <=10)){
            int z = a+b;
            z += 30;

            System.out.println(z);
        }else{
            System.out.println("Error: One of your entered integer doesn't meet the condition");
        }
        k.close();

    }
}
