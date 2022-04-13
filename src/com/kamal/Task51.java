package com.kamal;

public class Task51 {
    public static void main(String[] args) {
        String str = "Trying my best to learn java again";
        String shortest = "";
        String wordList[] = new String[str.length()];
        int i = 0;
        String tempWord = "";

        str = str + " ";
        for(int n = 0; n < str.length(); n++){
            if(str.charAt(n) != ' '){
                tempWord = tempWord + str.charAt(n);

            }else{
                wordList[i++] = tempWord;
                tempWord="";
            }
        }
        //shortest = wordList[0];
        for(int n = 0; n < i; n++){
            if(shortest.length() < wordList[n].length()){
                shortest = wordList[n];
            }
        }
        System.out.println("Shortest word: "+shortest);
    }
}
