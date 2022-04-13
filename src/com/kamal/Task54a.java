package com.kamal;

public class Task54a {
    public static void main(String[] args) {
        String str = "Hello I am Monday";
        String wordArr[] = str.split("\\s");
        String newString = "";
        //StringBuilder sb = new StringBuilder();
        for(String n:wordArr){
            StringBuilder sb = new StringBuilder(n);
            sb.reverse();
            newString += sb.toString()+" ";
        }
        System.out.println(newString);
    }
}
