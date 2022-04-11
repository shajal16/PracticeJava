package com.kamal;

public class Task48 {
    public static int newLength(int []a){
        int temp[] = new int[a.length];
        int t = 0;
        int count =0;
        for(int n = 0; n< a.length-1; n++){
            if(a[n] != a[n+1]){
                temp[t++] = a[n];
            }

        }
        temp[t++] = a[a.length-1];
        return t;
    }


    public static void main(String[] args) {
        int a[] = {1,2,2,3,3,4,5,6,6,7};
        System.out.print(newLength(a));

    }
}
