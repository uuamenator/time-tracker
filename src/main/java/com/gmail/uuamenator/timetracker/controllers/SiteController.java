package com.gmail.uuamenator.timetracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class SiteController {

    @GetMapping("")
    @ResponseBody
    public String home(){
        return "Hasta La Vista, baby";
    }
}
