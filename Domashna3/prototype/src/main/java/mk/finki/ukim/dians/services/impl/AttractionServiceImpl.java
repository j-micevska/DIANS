package mk.finki.ukim.dians.services.impl;

import mk.finki.ukim.dians.model.Attraction;
import mk.finki.ukim.dians.repository.AttractionRepository;
import mk.finki.ukim.dians.services.AttractionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttractionServiceImpl implements AttractionService {

    final AttractionRepository attractionRepository;

    public AttractionServiceImpl(AttractionRepository attractionRepository) {
        this.attractionRepository = attractionRepository;
    }

    @Override
    public List<Attraction> findAllSkopje() {
        return attractionRepository.findAllSkopje();
    }
    @Override
    public List<Attraction> findAllOhrid() {
        return attractionRepository.findAllOhrid();
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
    public Optional<Attraction> findByNameSkopje(String name) {
        return attractionRepository.findByNameSkopje(name);
    }
    @Override
    public Optional<Attraction> findByNameOhrid(String name) {
        return attractionRepository.findByNameOhrid(name);
    }

    @Override
    public Optional<Attraction> saveSkopje(String lat, String lon, String name, String description,String photo) {
        return attractionRepository.saveSkopje(lat, lon, name, description,photo);
    }
    @Override
    public Optional<Attraction> saveOhrid(String lat, String lon, String name, String description,String photo) {
        return attractionRepository.saveOhrid(lat, lon, name, description,photo);
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

