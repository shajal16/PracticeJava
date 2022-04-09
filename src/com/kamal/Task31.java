package com.kamal;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Please Enter a number to get its Multiplications table");
        int inp = k.nextInt();
        for(int c = 1; c <= 10; ++c)
        {
            System.out.println(inp + " * " + c + " = " + inp*c);
        }
        k.close();
    }
}
