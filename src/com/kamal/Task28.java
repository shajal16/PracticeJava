package com.kamal;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        System.out.println("Please enter a Character");
        Scanner k = new Scanner(System.in);
        char s = k.next().charAt(0);
        if(s == 'r' || s == 'a' || s == 'n' || s == 'd' || s == 'o' || s == 'm')
            System.out.println("FOUND");
        else if (s == 'R' || s == 'A' || s == 'N' || s == 'D' || s == 'O' || s == 'M')
            System.out.println("FOUND");
        else
            System.out.println("NOT FOUND");
        k.close();
    }
}
