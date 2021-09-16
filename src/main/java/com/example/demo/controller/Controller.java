package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@Log4j2
@RequiredArgsConstructor

public class Controller {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){ return "/login";}
    @GetMapping("/next")
    public String next(){return "/next";}
    @GetMapping("/start")
    public String start(){ return "/start";}

}
