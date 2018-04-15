package com.example.demo;

public class Pesel {

    private boolean pesel;

    Pesel(String text){
        pesel = isCorrect(text);
    }

    public boolean getPesel() {
        return pesel;
    }

    public void setPesel(boolean pesel) {
        this.pesel = pesel;
    }

    public boolean isCorrect(String text) {
        int psize = text.length();
        if (psize != 11) {
            return false;
        }
        int[] weights = { 1, 3, 7, 9, 1, 3, 7, 9, 1, 3 };
        int j = 0, sum = 0, control = 0;
        int csum = Integer.valueOf(text.substring(psize - 1));
        for (int i = 0; i < psize - 1; i++) {
            char c = text.charAt(i);
            j = Integer.valueOf(String.valueOf(c));
            sum += j * weights[i];
        }
        control = 10 - (sum % 10);
        if (control == 10) {
            control = 0;
        }
        return (control == csum);
    }
}
