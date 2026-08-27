package com.test;

public class Wrapper {



    public static String wrap(String word, int width) {
        int wordLength = word.length();
        if(wordLength < width){
            return "";
        }


        StringBuilder res = new StringBuilder();
        int position = 0;



        while(position < wordLength - width){
            int whitespace = word.lastIndexOf(' ', position + width);
            int appendAt;
            int offset = 0;
            if(position < whitespace){
                appendAt = whitespace;
                offset = 1;
            }
            else {
                appendAt = position+width;
            }
            res.append(word.substring(position, appendAt));
            res.append("\n");
            position=appendAt+ offset;
        }
        res.append(word.substring(position));
        return res.toString();
    }
}
