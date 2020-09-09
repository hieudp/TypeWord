package com.hieudp;

import java.util.ArrayList;

public class Word {
    private ArrayList<Key> word = new ArrayList<>();

    public Word(String word) {
        char[] s = word.toCharArray();
        for(char letter : s){
            this.word.add(new Key(letter));
        }
    }

    public String getWord() {
        String s = "";
        for(Key letter : word){
            s += letter.getLetter();
        }
        return s;
    }
}
