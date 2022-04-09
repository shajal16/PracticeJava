package com.kamal;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        while(true){
            System.out.println("Enter an Integer");
            int inp = k.nextInt();
            if (inp%2 != 0){
                System.out.println("It's Over");
                break;
            }
            System.out.println("Good Going");

        }
        k.close();

    }
}
