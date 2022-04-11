package com.kamal;

public class Task47 {
    public static void main(String[] args) {
        int a[] = {5,6,7,8,9,20};
        int largest = a[0];
        int smallest = a[0];
        if(a.length >= 1){
            for (int n = 0; n < a.length; n++){
                if (a[n] > largest)
                    largest = a[n];
                if (a[n]< smallest)
                    smallest = a[n];
            }
        }else{
            System.out.println("The Array is not lengthy enough");
        }
        System.out.println("Diff between largest and smallest is: "+ (largest -smallest));
    }
}
