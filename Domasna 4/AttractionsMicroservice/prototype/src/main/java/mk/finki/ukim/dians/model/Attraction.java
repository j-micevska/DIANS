package mk.finki.ukim.dians.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Attraction {

    String id;
    String lat;
    String lon;
    String name;
    String description;
    String review;
    String image;

    public Attraction(String lat, String lon, String name, String description,String review,String image) {
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.description = description;
        this.image=image;
        this.review=review;
    }
}
