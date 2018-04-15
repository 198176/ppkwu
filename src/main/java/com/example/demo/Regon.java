package com.example.demo;

public class Regon {

    private boolean regon;

    Regon(String text) {
        regon = isCorrect(text);
    }

    public boolean getRegon() {
        return regon;
    }

    public void setRegon(boolean regon) {
        this.regon = regon;
    }

    public boolean isCorrect(String text) {
        int rsize = text.length();
        if (!((rsize == 9) || (rsize == 14))) {
            return false;
        }

        int[] weights = { 8, 9, 2, 3, 4, 5, 6, 7 };
        int[] weights14 = { 2, 4, 8, 5, 0, 9, 7, 3, 6, 1, 2, 4, 8 };

        if (rsize == 14) {
            weights = weights14;
        }

        int j = 0, sum = 0, control = 0;
        int csum = Integer.valueOf(text.substring(rsize - 1));
        for (int i = 0; i < rsize - 1; i++) {
            char c = text.charAt(i);
            j = Integer.valueOf(String.valueOf(c));
            sum += j * weights[i];
        }

        control = sum % 11;
        if (control == 10) {
            control = 0;
        }
        return (control == csum);
    }
}
