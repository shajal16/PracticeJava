package com.kamal;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println(" Enter 1 - Addition\n" +
                " Enter 2 - Subtraction\n" +
                " Enter 3 - Division\n" +
                " Enter 4 - Multiplication\n" +
                " Enter 5 - Average");
        int op = k.nextInt();
        float a = 0;
        float b = 0;
        float c = 0;
        float d = 0;
        float result = 0;
        if(op <= 5 && op >=1){
            System.out.println("enter two numbers to perform the operation");
            a = k.nextFloat();
            b = k.nextFloat();
            if (op == 5){
                System.out.println("please Enter two more numbers");
                c = k.nextFloat();
                d = k.nextFloat();
            }
            switch (op){
                case 1:
                    result = a+b;
                    break;
                case 2:
                    result = a - b;
                    break;
                case 3:
                    result = a/b;
                    break;
                case 4:
                    result = a*b;
                    break;
                case 5:
                    result = (a+b+c+d)/4;
                    break;
            }
            if (result < 0){
                System.out.println(" Oops option "+ op +" is returning the negative number "+ result);
            }else{
                System.out.println("Result: "+result);
            }

        }else{
            System.out.println("Please Re-run and enter a valid operation number within the range");
        }
        k.close();


    }
}
