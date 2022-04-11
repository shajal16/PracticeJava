package com.kamal;

import java.util.Arrays;

public class Task43{
    public static void main(String[] args) {
        int a[] = {1,2,6,9,10,12,11};
        int temp = 0;
        for(int n = 0; n< a.length-1; n++){
            if(a[n] > a[n+1]){
                temp = a[n];
                a[n] = a[n+1];
                a[n+1] = temp;
            }
        }
        System.out.println("First method: Second Largest: "+ a[1]);
        //Another method without considering complex situations e.g- duplicate numbers
        int b[] = {1,2,6,9,10,12,11};
        Arrays.sort(b);
        System.out.println("First method: Second Largest: "+ b[1]);
    }
}
