package com.kamal;

public class Task49 {
    public static void main(String[] args) {
        int a[] = {5,6,7,8,9};
        int sum = 14;
        int checker = 0;
        for(int n = 0; n<a.length - 1; n++){
            for(int c = (n+1); c<a.length; c++){
                if (a[n] + a[c] == sum){
                    System.out.println("Element-"+a[n]+" and "+a[c]+ " equalsto= "+ sum );
                    checker++;
                }
            }
        }
        if(checker==0){
            System.out.println("No elements are equals to the sum");
        }
    }
}
