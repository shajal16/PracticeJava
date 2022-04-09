package com.kamal;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Ple4ase Enter a long number: ");
        long l = k.nextLong();
        long sum = 0;
        long count = 0;
        while(l != 0){
            long temp = l%10;
            sum += temp;
            l /= 10;
            count++;
        }
        System.out.println("count of Digits: "+count +"\nSum of digits: " + sum);
        k.close();
    }
}
