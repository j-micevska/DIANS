package mk.finki.ukim.dians.web.controllers;

import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/AboutUs")
public class AboutUsController {
    @GetMapping
    public String getHomePage(){
        return "AboutUs";
    }
}
