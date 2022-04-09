package com.kamal;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        System.out.println("Enter any Integer number");
        Scanner k = new Scanner(System.in);
        int inp = k.nextInt();
        if (inp%5 ==0 && inp%3 ==0){
            System.out.println("Consultadd JAVA Training");

        }else if(inp%3 ==0){
            System.out.println("Consultadd");
        }else if(inp%5 ==0){
            System.out.println("JAVA Training");
        }else{
            System.out.println("The given number doesn't meet any of the conditions");
        }
        k.close();
    }
}
