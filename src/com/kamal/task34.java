package com.kamal;

import java.util.Scanner;

public class task34 {
    public static void main(String[] args) {
        System.out.print("Please Enter a number: ");
        Scanner k = new Scanner(System.in);
        long n = k.nextLong();
        long sum =0;
        for (long c = 1; c<=n; c++ ){
            sum += c;
            System.out.print(c + " ");
        }
        System.out.println("\nSum of Natural numbers range: "+sum);
        k.close();
    }
}
