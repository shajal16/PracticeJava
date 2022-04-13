package com.kamal;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.*;

public class Task54 {
    public static void main(String[] args) {
        String str = "Solution";
        int length = str.length();
        int checker = 0;
        str = str.toLowerCase();
        char c[] = str.toCharArray();
        Arrays.sort(c);
        for (int n = 0; n< length - 1; n++ )
        {
            if(c[n] == c[n +1]){
                System.out.println("False");
                break;
            }
            checker++;
        }
        if(checker == length-1)
        System.out.println("True");

        ///

    }
}
