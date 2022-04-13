package com.kamal;

public class Task53 {
    public static void main(String[] args) {
        String str = "  You Only Die  Once";
        char aStr[] = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int n = 0; n<aStr.length; n++){
            if(aStr[n] != ' ' && aStr[n] != '\t'){
                sb.append(aStr[n]);
            }
        }
        System.out.println(sb.toString());
    }
}
