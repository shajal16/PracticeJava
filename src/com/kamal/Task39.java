package com.kamal;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Please Enter the row number:");
        int a = k.nextInt();
        for(int n = 0; n<= a; n++) {
            for (int c = 1; c <= n; c++)
                System.out.print(c);
            System.out.println("");
        }
        k.close();
    }
}
