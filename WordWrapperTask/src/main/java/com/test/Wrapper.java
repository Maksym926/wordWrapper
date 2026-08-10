package com.test;

public class Wrapper {



    public static String wrap(String word, int width) {
        int wordLength = word.length();
        if(wordLength < width){
            return "";
        }
        StringBuilder res = new StringBuilder();
        int counter = 0;
        while(counter < wordLength - width){
            res.append(word.substring(counter, counter+width) + "\n");
            counter+=width;
        }
        res.append(word.substring(counter));
        return res.toString();
    }
}
