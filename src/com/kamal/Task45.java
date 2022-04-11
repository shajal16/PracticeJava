package com.kamal;

public class Task45 {
    public static void main(String[] args) {
        int a[] = {1,0,2,0,3,0,4,0,5};
        int l = a.length;
        int c = 0;
        for(int n = 0; n< l; n++){
            if(a[n] != 0) {
                a[c] = a[n];
                c++;
            }
        }
        //for(c; c<l; c++)
        while(c<l){
            a[c] = 0;
            c++;
        }
        for(int r = 0; r< l; r++){
            System.out.print(a[r]+" ");
        }

    }
}
