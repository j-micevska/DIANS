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

//    @GetMapping
//    public String getMap(Model model){
//        List<Attraction> attractionsSkopje=this.attractionService.findAllSkopje();
//        List<Attraction> attractionsOhrid=this.attractionService.findAllOhrid();
//        model.addAttribute("attractionsSkopje", attractionsSkopje);
//        model.addAttribute("attractionsOhrid", attractionsOhrid);
//        return "Map";

        @GetMapping("/MapSkopje")
        public String getMapSkopje(Model model) {
            List<Attraction> attractionsSkopje = this.attractionService.findAllSkopje();
            model.addAttribute("attractionsSkopje", attractionsSkopje);
            return "MapSkopje.html";
        }

        @GetMapping("/MapOhrid")
        public String getMapOhrid(Model model){
            List<Attraction> attractionsOhrid=this.attractionService.findAllOhrid();
            model.addAttribute("attractionsOhrid", attractionsOhrid);
            return "MapOhrid.html";
    }
}