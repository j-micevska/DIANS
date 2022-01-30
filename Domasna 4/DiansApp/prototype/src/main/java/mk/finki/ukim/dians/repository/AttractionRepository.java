package mk.finki.ukim.dians.repository;

import mk.finki.ukim.dians.bootstrap.DataHolder;
import mk.finki.ukim.dians.model.Attraction;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AttractionRepository{

    public List<Attraction> findAllSkopje() {
        return DataHolder.attractionsSkopje;
    }

    public List<Attraction> findAllOhrid() {
        return DataHolder.attractionsOhrid;
    }

    public Optional<Attraction> findByIdSkopje(String id) {
        return DataHolder.attractionsSkopje.stream().filter(i -> i.getId().equals(id)).findFirst();
    }

    public Optional<Attraction> findByIdOhrid(String id) {
        return DataHolder.attractionsOhrid.stream().filter(i -> i.getId().equals(id)).findFirst();
    }

    public List<Attraction> findByNameSkopje(String name) {
        return DataHolder.attractionsSkopje.stream().filter(i -> i.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public List<Attraction> findByNameOhrid(String name) {
        return DataHolder.attractionsOhrid.stream().filter(i -> i.getName().toLowerCase().contains(name.toLowerCase())).collect(Collectors.toList());
    }

    public void deleteByIdSkopje(String id) {
        DataHolder.attractionsSkopje.removeIf(i -> i.getId().equals(id));
    }

    public void deleteByIdOhrid(String id) {
        DataHolder.attractionsOhrid.removeIf(i -> i.getId().equals(id));
    }

    public void deleteByNameSkopje(String name) {
        DataHolder.attractionsSkopje.removeIf(i -> i.getName().equals(name));
    }

    public void deleteByNameOhrid(String name) {
        DataHolder.attractionsOhrid.removeIf(i -> i.getName().equals(name));
    }
    public Optional<Attraction> saveSkopje(String lat, String lon, String name, String description,String review,String image) {
        DataHolder.attractionsSkopje.removeIf(i -> i.getName().equals(name));
        Attraction attraction = new Attraction(lat,lon,name,description,review,image);
        DataHolder.attractionsSkopje.add(attraction);
        return Optional.of(attraction);
    }
    public Optional<Attraction> saveOhrid(String lat, String lon, String name, String description,String review,String image) {
        DataHolder.attractionsOhrid.removeIf(i -> i.getName().equals(name));
        Attraction attraction = new Attraction(lat,lon,name,description,review,image);
        DataHolder.attractionsOhrid.add(attraction);
        return Optional.of(attraction);
    }
}

