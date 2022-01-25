package mk.finki.ukim.dians.web.controllers;

import mk.finki.ukim.dians.model.Attraction;
import mk.finki.ukim.dians.services.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class MapController {

    final AttractionService attractionService;

    public MapController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

        @GetMapping("/MapSkopje")
        public String getMapSkopje(Model model) {
            List<Attraction> attractionsSkopje = this.attractionService.findAllSkopje();
            model.addAttribute("attractionsSkopje", attractionsSkopje);
            model.addAttribute("bodyContent", "MapSkopje.html");
            return "master-template";
        }

        @GetMapping("/MapOhrid")
        public String getMapOhrid(Model model){
            List<Attraction> attractionsOhrid=this.attractionService.findAllOhrid();
            model.addAttribute("attractionsOhrid", attractionsOhrid);
            model.addAttribute("bodyContent", "MapOhrid.html");
            return "master-template";
    }
}