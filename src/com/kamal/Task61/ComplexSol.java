package com.kamal.Task61;

import java.util.Scanner;

public class ComplexSol {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter First Complex numbers");
        int a = k.nextInt();
        int b = k.nextInt();
        System.out.println("Enter Second Complex Number");
        int c = k.nextInt();
        int d = k.nextInt();

        Complex C1 = new Complex(a,b);
        Complex C2 = new Complex(c,d);
        System.out.print(" First Complex number: ");
        C1.printing();
        System.out.print(" Second Complex number: ");
        C2.printing();

        Complex addition = Complex.add(C1,C2);
        Complex subtraction = Complex.subs(C1,C2);
        Complex product = Complex.prod(C1,C2);

        System.out.print("Addition: ");
        addition.printing();
        System.out.print("Subtraction: ");
        subtraction.printing();
        System.out.print("Multiplication: ");
        product.printing();



    }

}
