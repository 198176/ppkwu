package com.example.demo;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

public class Mail {

    private boolean mail;

    Mail(String text){
        mail = isCorrect(text);
    }

    public boolean getMail() {
        return mail;
    }

    public void setMail(boolean mail) {
        this.mail = mail;
    }

    public boolean isCorrect(String text){
        boolean result = true;
        try {
            InternetAddress emailAddr = new InternetAddress(text);
            emailAddr.validate();
        } catch (AddressException ex) {
            result = false;
        }
        return result;
    }
}
