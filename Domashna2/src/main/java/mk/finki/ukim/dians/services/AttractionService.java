package mk.finki.ukim.dians.services;


import mk.finki.ukim.dians.model.Attraction;

import java.util.List;
import java.util.Optional;

public interface AttractionService {

    List<Attraction> findAllSkopje();
    List<Attraction> findAllOhrid();

    Optional<Attraction> findByIdSkopje(String id);
    Optional<Attraction> findByIdOhrid(String id);

    Optional<Attraction> findByNameSkopje(String name);
    Optional<Attraction> findByNameOhrid(String name);

    Optional<Attraction> saveSkopje(String lat, String lon, String name, String description);
    Optional<Attraction> saveOhrid(String lat, String lon, String name, String description);

   // Optional<TouristAttraction> save(ProductDto productDto);

   // Optional<TouristAttraction> edit(String lat, String lon, String name, String description);

  //  Optional<TouristAttraction> edit(Long id, ProductDto productDto);

    void deleteByIdSkopje(String id);
    void deleteByIdOhrid(String id);
}
