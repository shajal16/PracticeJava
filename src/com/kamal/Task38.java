package com.kamal;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = k.nextInt();
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("It's a Leap year");
        } else {
            System.out.println("It's NOT a Leap year");
        }
        k.close();
    }
}
