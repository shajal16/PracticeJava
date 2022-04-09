package com.kamal;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        int inp;
        System.out.println("Enter an Integer number:");
        Scanner k = new Scanner(System.in);
        inp = k.nextInt();
        if ( inp % 2 == 0 ) {
            if(inp >= 2 && inp <= 5)
                System.out.println("OLD");
            else if (inp >=6 && inp <=30)
                System.out.println("NEW");
            else if (inp > 30)
                System.out.println("OLD");
            else
                System.out.println("ITS A " + inp );
        }
        else
            System.out.println("NEW");
        k.close();
    }
}
