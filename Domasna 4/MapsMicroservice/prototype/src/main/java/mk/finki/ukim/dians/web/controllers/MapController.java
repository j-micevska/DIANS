package mk.finki.ukim.dians.web.controllers;

import lombok.extern.slf4j.Slf4j;
import mk.finki.ukim.dians.model.Attraction;
import mk.finki.ukim.dians.services.AttractionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@Slf4j
@RequestMapping("/Map")
public class MapController {

    final AttractionService attractionService;

    public MapController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

        @GetMapping("/Skopje")
        public List<Attraction> getMapSkopje(Model model) {
            List<Attraction> attractionsSkopje = this.attractionService.findAllSkopje();
            return attractionsSkopje;
//            model.addAttribute("attractionsSkopje", attractionsSkopje);
//            model.addAttribute("bodyContent", "MapSkopje");
//            return "master-template";
        }

        @GetMapping("/Ohrid")
        public List<Attraction> getMapOhrid(Model model){
            List<Attraction> attractionsOhrid=this.attractionService.findAllOhrid();
            return attractionsOhrid;
//            model.addAttribute("attractionsOhrid", attractionsOhrid);
//            model.addAttribute("bodyContent", "MapOhrid");
//            return "master-template";
    }
}