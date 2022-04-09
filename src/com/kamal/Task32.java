package com.kamal;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        int a = 0;
        int sum = 0;
        int avg =0;
        int count = 1;
        System.out.println("Please insert 10 number when prompted");
        Scanner k = new Scanner(System.in);
        while(count <=10){
            System.out.println("Enter a number");
            a = k.nextInt();
            sum += a;
            count++;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+ sum/10);
        k.close();
    }
}
