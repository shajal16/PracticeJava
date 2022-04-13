package com.kamal;

public class Task52 {
    public static void main(String[] args) {
        int a[] = {1,2,6,9,10,12,11};
        int sum = 0;
        for(int n = 0; n< a.length-1; n++){
            if(a[n] > a[n+1]){
                int temp = a[n];
                a[n] = a[n+1];
                a[n+1] = temp;
            }
        }
        for(int n = 1; n< a.length-1; n++){
            sum = sum+a[n];
            //System.out.println( a[n]);
        }
        System.out.println("sum: "+ sum);
    }
}
