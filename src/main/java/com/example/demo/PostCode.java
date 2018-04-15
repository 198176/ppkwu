package com.example.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostCode {

    private boolean code;

    PostCode(String text) {
        code = isCorrect(text);
    }

    public boolean getCode() {
        return code;
    }

    public void setCode(boolean code) {
        this.code = code;
    }

    public boolean isCorrect(String text) {
        if (text.isEmpty()) {
            return false;
        }

        boolean isValid;

        String postcodePLPattern = "^[0-9]{2}-[0-9]{3}$";

        Pattern pattern = Pattern.compile(postcodePLPattern);
        Matcher matcher = pattern.matcher(text);

        isValid = matcher.matches();

        return isValid;
    }
}
