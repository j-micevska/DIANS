package mk.finki.ukim.dians.web.controllers;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import mk.finki.ukim.dians.model.Attraction;
import mk.finki.ukim.dians.services.AttractionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/Attractions")
public class AttractionsController {

    final AttractionService attractionService;

    public AttractionsController(AttractionService attractionService) {
        this.attractionService = attractionService;
    }

    @GetMapping
    public String getAttractionsPage(Model model){
        List<Attraction> attractionsSkopje=this.attractionService.findAllSkopje();
        List<Attraction> attractionsOhrid=this.attractionService.findAllOhrid();
        model.addAttribute("attractionsSkopje", attractionsSkopje);
        model.addAttribute("attractionsOhrid", attractionsOhrid);
        return "Attractions.html";
    }



}
