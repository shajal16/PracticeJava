package com.kamal;

public class Task44 {
    public static void main(String[] args) {
        int a[][]= {{1,2},{3,4}};
        int b[][]= {{1,2},{3,4}};

        int sum[][] = new int[2][2];
        for(int n = 0; n< 2; n++){
            for(int c = 0; c<2; c++){
                sum [n][c]= a[n][c] + b[n][c];
                System.out.print(sum[n][c]+ " ");
            }
            System.out.println("");
        }

    }
}
