package com.example.demo;

public class Nip {

    private boolean nip;

    Nip(String text){
        nip = isCorrect(text);
    }

    public boolean getNip() {
        return nip;
    }

    public void setNip(boolean nip) {
        this.nip = nip;
    }

    public boolean isCorrect(String text) {
        int nsize = text.length();
        if (nsize != 10) {
            return false;
        }
        int[] weights = { 6, 5, 7, 2, 3, 4, 5, 6, 7 };
        int j = 0, sum = 0, control = 0;
        int csum = Integer.valueOf(text.substring(nsize - 1));
        for (int i = 0; i < nsize - 1; i++) {
            char c = text.charAt(i);
            j = Integer.valueOf(String.valueOf(c));
            sum += j * weights[i];
        }
        control = sum % 11;
        return (control == csum);
    }
}
