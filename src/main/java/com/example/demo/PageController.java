package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

    @RequestMapping("/")
    public String mainPage() {
        return "Hello World!";
    }

    @RequestMapping("/rev/{string}")
    @ResponseBody
    public String pathVariableExample(@PathVariable("string") String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
