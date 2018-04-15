package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FormController {

    @RequestMapping("/checkMail")
    @ResponseBody
    public Mail checkMail(@RequestParam("mail") String mail) {
        return new Mail(mail);
    }

    @RequestMapping("/checkNip")
    @ResponseBody
    public Nip checkNip(@RequestParam("nip") String nip) {
        return new Nip(nip);
    }

    @RequestMapping("/checkPesel")
    @ResponseBody
    public Pesel checkPesel(@RequestParam("pesel") String pesel) {
        return new Pesel(pesel);
    }

    @RequestMapping("/checkRegon")
    @ResponseBody
    public Regon checkRegon(@RequestParam("regon") String regon) {
        return new Regon(regon);
    }
}
