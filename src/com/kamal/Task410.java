package com.kamal;

public class Task410 {
    public static void main(String[] args) {
        int a[] = {5,6,7,8,9,10,-5,-7,-4,8};
        int minSum = a[0] +a[1];
        int firstNum = 0;
        int secondNum =0;

        for (int n = 0; n< a.length -1; n++){
            for(int c = n+1; c<a.length; c++){
                int sum = a[n]+ a[c];
                if(Math.abs(minSum) > Math.abs(sum)){
                    minSum = sum;
                    firstNum = n;
                    secondNum = c;
                }
            }
        }
        System.out.println("Two minimum sum numbers are: "+ a[firstNum] +" and "+ a[secondNum]);
     }
}
