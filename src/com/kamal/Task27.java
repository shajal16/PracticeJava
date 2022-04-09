package com.kamal;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Insert a Number");
        float inp = k.nextFloat();
        if (inp > 0)
        {
            if (inp < 1)
                System.out.println("positive small");
            else if (inp > 1000000)
                System.out.println("positive large");
            else
                System.out.println("positive");
        }
        else if (inp < 0)
        {
            if (Math.abs(inp) < 1)
                System.out.println("negative small");
            else if (Math.abs(inp) > 1000000)
                System.out.println("negative large");
            else
                System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
        k.close();
    }
}
