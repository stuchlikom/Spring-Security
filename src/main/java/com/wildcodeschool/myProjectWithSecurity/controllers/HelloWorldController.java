package com.wildcodeschool.myProjectWithSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String all() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String heroes() {
        return "Avengers..... Assemble";
    }

    @GetMapping("/secret-bases")
    public String admin() {
        return "<b>France</b><br>Biarritz<br>Bordeaux<br>La Loupe<br>Lille<br>Lyon<br>Marseille<br>Nantes<br>Orleans<br>Paris<br>Reims<br>Strasbourg<br>Toulouse<br>Tours<br><br>" +
               "<b>Europe</b><br>Amsterdam<br>Barcelona<br>Berlin<br>Brussels<br>Bucharest<br>Budapest<br>Dublin<br>Lisbon<br>London<br>Madrid<br>Milan";
    }

}