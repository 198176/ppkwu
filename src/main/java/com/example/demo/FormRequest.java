package com.example.demo;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

public class FormRequest {
    @Email
    private String mail;

    @Size(min = 10, max = 10)
    private String nip;

    @Size(min = 11, max = 11)
    private String pesel;

    @Size(min = 9)
    private String regon;

    @Size(min = 6, max = 6)
    private String kod;

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getRegon() {
        return regon;
    }

    public void setRegon(String regon) {
        this.regon = regon;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
