package com.kamal;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Task57 {

    public static void main(String[] args) {
        Deque<Character> charQ = new ArrayDeque<Character>();
        Scanner k = new Scanner(System.in);
        String str = k.next();
        boolean result = false;
        for (int n = 0; n<str.length(); n++){
            char c = str.charAt(n);
            if(c == '(' || c=='{' || c== '[')
            {
                charQ.push(c);
            }
            if(charQ.isEmpty()){
                result = false;
                break;
            }
            char tmp;
            switch(c){
                case ')':
                    tmp = charQ.pop();
                    if (tmp =='{' || tmp == '['){
                        result = false;
                    }
                    break;
                case '}':
                    tmp = charQ.pop();
                    if(tmp =='(' || tmp == '['){
                        result = false;
                    }
                    break;
                case ']':
                    tmp = charQ.pop();
                    if(tmp == '(' || tmp == '{'){
                        result = false;
                    }
                    break;
            }
        }
        System.out.println(charQ.isEmpty());
    }
}
