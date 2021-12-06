package mk.finki.ukim.dians.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Map")
public class MapController {
    @GetMapping
    public String getHomePage(){
        return "Map";
    }
}