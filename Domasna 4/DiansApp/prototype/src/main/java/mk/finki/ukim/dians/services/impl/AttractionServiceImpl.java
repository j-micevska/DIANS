package mk.finki.ukim.dians.services.impl;

import mk.finki.ukim.dians.model.Attraction;
import mk.finki.ukim.dians.repository.AttractionRepository;
import mk.finki.ukim.dians.services.AttractionService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class AttractionServiceImpl implements AttractionService {

    final AttractionRepository attractionRepository;
    final RestTemplate restTemplate;

    public AttractionServiceImpl(AttractionRepository attractionRepository, RestTemplate restTemplate) {
        this.attractionRepository = attractionRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public List<Attraction> findAllSkopje() {
        Attraction[] attractions=restTemplate.getForObject("http://localhost:9191/Attractions/Skopje",Attraction[].class);
        List<Attraction> attractionsSkopje= Arrays.asList(attractions);
        return attractionsSkopje;

    }
    @Override
    public List<Attraction> findAllOhrid() {
        Attraction[] attractions=restTemplate.getForObject("http://localhost:9191/Attractions/Ohrid",Attraction[].class);
        List<Attraction> attractionsOhrid= Arrays.asList(attractions);
        return attractionsOhrid;
    }

    @Override
    public Optional<Attraction> findByIdSkopje(String id) {
        return attractionRepository.findByIdSkopje(id);
    }
    @Override
    public Optional<Attraction> findByIdOhrid(String id) {
        return attractionRepository.findByIdOhrid(id);
    }

    @Override
    public List<Attraction> findByNameSkopje(String name) {
        return attractionRepository.findByNameSkopje(name);
    }
    @Override
    public List<Attraction> findByNameOhrid(String name) {
        return attractionRepository.findByNameOhrid(name);
    }

    @Override
    public Optional<Attraction> saveSkopje(String lat, String lon, String name, String description,String review,String image) {
        return attractionRepository.saveSkopje(lat, lon, name, description,review,image);
    }
    @Override
    public Optional<Attraction> saveOhrid(String lat, String lon, String name, String description,String review,String image) {
        return attractionRepository.saveOhrid(lat, lon, name, description,review,image);
    }

    @Override
    public void deleteByIdSkopje(String id) {
        attractionRepository.deleteByIdSkopje(id);
    }
    @Override
    public void deleteByIdOhrid(String id) {
        attractionRepository.deleteByIdOhrid(id);
    }
}

