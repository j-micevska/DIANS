package mk.finki.ukim.dians.web.controllers;

import lombok.extern.slf4j.Slf4j;
import mk.finki.ukim.dians.model.Attraction;
import mk.finki.ukim.dians.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/Attractions")
//@Slf4j
public class AttractionsController {

    @Autowired
    final AttractionService attractionService;

    public AttractionsController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }


    @GetMapping("/Skopje")
    public List<Attraction> getAttractionsSkopje(Model model){
          List<Attraction> attractionsSkopje=this.attractionService.findAllSkopje();
//        model.addAttribute("attractionsSkopje", attractionsSkopje);
//        model.addAttribute("bodyContent", "AttractionsSkopje");
//        return "master-template";
        return attractionsSkopje;
    }

    @GetMapping("/Ohrid")
    public List<Attraction> getAttractionsOhrid(Model model){
        List<Attraction> attractionsOhrid=this.attractionService.findAllOhrid();
        //model.addAttribute("attractionsOhrid", attractionsOhrid);
        //model.addAttribute("bodyContent", "AttractionsOhrid");
//        return "master-template";
        return attractionsOhrid;
    }

    @PostMapping("/Skopje")
    public List<Attraction> attractionsSearchSkopje(Model model, @RequestParam(value = "searchSkopje",required = false) String searchSkopje){
        List<Attraction> foundSkopje= this.attractionService.findByNameSkopje(searchSkopje);
       // model.addAttribute("foundSkopje", this.attractionService.findByNameSkopje(searchSkopje));
        //model.addAttribute("bodyContent", "AttractionsSkopje");
        //return "master-template";
        return foundSkopje;
    }

    @PostMapping("/Ohrid")
    public List<Attraction> attractionsSearchOhrid(Model model, @RequestParam(value = "searchOhrid",required = false) String searchOhrid){
        List<Attraction> foundOhrid= this.attractionService.findByNameOhrid(searchOhrid);
//        model.addAttribute("foundOhrid", this.attractionService.findByNameOhrid(searchOhrid));
//        model.addAttribute("bodyContent", "AttractionsOhrid");
//        return "master-template";
        return foundOhrid;
    }

}
