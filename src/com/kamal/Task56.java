package com.kamal;

public class Task56 {
    public static void main(String[] args) {
        String str = "hello WorLd";
        StringBuilder sb = new StringBuilder();
        char c = 0;
        for(int n = 0; n<str.length(); n++){
            c = str.charAt(n);
            if(Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            }
            else if(Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
