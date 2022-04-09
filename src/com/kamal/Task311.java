package com.kamal;

import java.util.Scanner;

public class Task311 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter two floating point number: ");
        float a = k.nextFloat();
        float b = k.nextFloat();

        if(Math.abs(a - b) == 0.01)
            System.out.println("Both Matches up-to 2 decimal");
        else
            System.out.println("They don't match");

        k.close();
    }
}
