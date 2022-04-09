package com.kamal;

import java.util.Scanner;

public class Task310 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Please Enter the row number:");
        int a = k.nextInt();
        for(int n = 0; n< a; n++) {
            for (int c = a; c > n; c--)
                System.out.print(" ");
            int p = 1;
            for(int i = 0; i<=n; i++){
                System.out.print(p+ " ");
                p = p*(n-i)/(i+1);
            }
            System.out.println("");
        }
        k.close();
    }
}
