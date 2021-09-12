package com.maven.testejava.SigaBem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StatusController {

    @GetMapping(path="/api/status")
    @ResponseBody
    public String check(){
        return "online";
    }
}
