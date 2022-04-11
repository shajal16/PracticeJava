package com.kamal;

public class Task46 {
    public static void main(String[] args) {
        int a[] = {1,2,2,3,3,4,5,6,6,7};
        int temp[] = new int[a.length];
        int t = 0;
        for(int n = 0; n< a.length-1; n++){
            if(a[n] != a[n+1]){
                temp[t++] = a[n];
            }

        }
        temp[t++] = a[a.length-1];
        //System.out.println(a.length);
        while(t<a.length){
            temp[t++] = 0;
        }
        for(int c = 0; c < t; c++){
            System.out.print(temp[c]+ " ");
        }
    }
}
