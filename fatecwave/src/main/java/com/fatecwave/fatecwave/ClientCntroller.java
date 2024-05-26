package com.fatecwave.fatecwave;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ClientCntroller {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
}
