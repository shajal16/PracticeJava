package com.kamal;

public class Task411 {
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
        int max1 = a.length-1;
        int min1 = 0;
        int tempA[] = new int[a.length];
        for(int n = 0; n < a.length; n++){
            if(n%2==0){
                tempA[n] = a[max1];
                max1--;
            }else{
                tempA[n] = a[min1];
                min1++;
            }
        }
        System.out.println("Sorted and arranged array: ");
        for(int c = 0; c< tempA.length; c++){
            System.out.print(tempA[c]+ " ");
        }
    }
}
