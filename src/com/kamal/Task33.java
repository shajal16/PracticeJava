package com.kamal;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        int days = 0;
        String nameMonth = "Invalid";

        System.out.print("Enter a number for month: ");
        int month = k.nextInt();

        switch (month) {
            case 1:
                nameMonth = "January";
                days = 31;
                break;
            case 2:
                nameMonth = "February";
                days = 28;
                break;
            case 3:
                nameMonth = "March";
                days = 31;
                break;
            case 4:
                nameMonth = "April";
                days = 30;
                break;
            case 5:
                nameMonth = "May";
                days = 31;
                break;
            case 6:
                nameMonth = "June";
                days = 30;
                break;
            case 7:
                nameMonth = "July";
                days = 31;
                break;
            case 8:
                nameMonth = "August";
                days = 31;
                break;
            case 9:
                nameMonth = "September";
                days = 30;
                break;
            case 10:
                nameMonth = "October";
                days = 31;
                break;
            case 11:
                nameMonth = "November";
                days = 30;
                break;
            case 12:
                nameMonth = "December";
                days = 31;
        }
        System.out.print(nameMonth + " - " + days + " days");
        k.close();
    }
}
