package com.kamal;

public class Task55 {
    public static void main(String[] args) {
        int a[] = {1,8,10,6,4,3,12};
        int b[] = {5,3,7,9,11,8,17,19,4,6};
        int oddCount = 0;
        int evenCount = 0;
        int newArr[];
        for(int n = 0; n<b.length; n++){
            if(b[n]%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        if(evenCount > oddCount){
            newArr = new int[evenCount];
            int count = 0;
            for(int n =0; n<a.length; n++) {
                if (a[n] % 2 == 0) {
                    newArr[count++] = a[n];
                }
            }
        }else{
            newArr = new int[oddCount];
            int count = 0;
            for(int n =0; n<b.length; n++) {
                if (b[n] % 2 != 0) {

                    newArr[count++] = b[n];
                }
            }
        }
        for(int n =0; n<newArr.length; n++){
            System.out.println(newArr[n]);
        }
    }
}
