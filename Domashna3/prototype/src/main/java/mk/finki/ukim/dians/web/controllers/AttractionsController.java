package mk.finki.ukim.dians.web.controllers;

import mk.finki.ukim.dians.model.Attraction;
import mk.finki.ukim.dians.services.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;


@Controller
public class AttractionsController {

    final AttractionService attractionService;

    public AttractionsController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }


    @GetMapping("/AttractionsSkopje")
    public String getAttractionsSkopje(Model model){
        List<Attraction> attractionsSkopje=this.attractionService.findAllSkopje();
        model.addAttribute("attractionsSkopje", attractionsSkopje);
        return "AttractionsSkopje.html";
    }

    @GetMapping("/AttractionsOhrid")
    public String getAttractionsOhrid(Model model){
        List<Attraction> attractionsOhrid=this.attractionService.findAllOhrid();
        model.addAttribute("attractionsOhrid", attractionsOhrid);
        return "AttractionsOhrid.html";
    }

    @PostMapping("/AttractionsSkopje")
    public String attractionsSearchSkopje(Model model,@RequestParam(value = "searchSkopje",required = false) String searchSkopje){
        List<Attraction> foundSkopje= this.attractionService.findByNameSkopje(searchSkopje);
        model.addAttribute("foundSkopje", this.attractionService.findByNameSkopje(searchSkopje));
        return "AttractionsSkopje.html";
    }

    @PostMapping("/AttractionsOhrid")
    public String attractionsSearchOhrid(Model model,@RequestParam(value = "searchOhrid",required = false) String searchOhrid){
        List<Attraction> foundOhrid= this.attractionService.findByNameOhrid(searchOhrid);
        model.addAttribute("foundOhrid", this.attractionService.findByNameOhrid(searchOhrid));
        return "AttractionsOhrid.html";
    }

}
