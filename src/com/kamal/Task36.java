package com.kamal;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Insert 1st number");
        int a = k.nextInt();
        System.out.println("Insert 2nd Number");
        int b = k.nextInt();
        System.out.println("Insert 3rd number");
        int c = k.nextInt();
        if (a < b && b < c)
            System.out.println("INCREASING");
        else if(a > b && b >c)
            System.out.println("DECREASING");
        else
            System.out.println("Neither increasing nor decreasing order");
        k.close();
    }
}
