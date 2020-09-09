package com.hieudp;

import java.awt.event.KeyEvent;

public class Key {
    private char letter;

    public Key(char letter) {
        this.letter = letter;
    }

    public char getLetter() {
        return letter;
    }

    public boolean pressedKey(KeyEvent e) {
        if(e.getKeyChar() == letter){
            return true;
        }
        return false;
    }
}
