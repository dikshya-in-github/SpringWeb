package io.virinchi.springweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controller - manages : Get Mapping, Post Mapping, etc
public class AllController {

    @GetMapping("/")
    public String firstPage(){
        return "firstPage.html";
    }
}
