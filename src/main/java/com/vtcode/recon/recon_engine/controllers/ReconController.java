package com.vtcode.recon.recon_engine.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReconController {

    @GetMapping("/health")
    public String healthCheck(){
        return "OK";
    }
}
