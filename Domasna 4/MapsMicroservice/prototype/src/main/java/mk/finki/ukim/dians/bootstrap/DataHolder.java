package mk.finki.ukim.dians.bootstrap;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import lombok.Getter;
import mk.finki.ukim.dians.model.Attraction;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

@Component
@Getter
public class DataHolder {
    public static List<Attraction> attractionsSkopje=new ArrayList<>();
    public static List<Attraction> attractionsOhrid=new ArrayList<>();


    @PostConstruct
    public void init() throws IOException, CsvValidationException {

        CSVReader reader1 = new CSVReader(new FileReader("src/main/resources/SkopjeEnc.csv"));
        String header1 = Arrays.toString(reader1.readNext());
        String[] tmp1;
        while ((tmp1 = reader1.readNext()) != null){
            String[] elements1 = Arrays.toString(tmp1).split(";");
            Attraction a=new Attraction(elements1[0],elements1[1], elements1[2],elements1[3],elements1[4],elements1[5],elements1[6]);
            attractionsSkopje.add(a);

        }

        CSVReader reader = new CSVReader(new FileReader("src/main/resources/OhridEnc.csv"));
        String header = Arrays.toString(reader.readNext());
        String[] tmp;
        while ((tmp = reader.readNext()) != null){
            String[] elements = Arrays.toString(tmp).split(";");
            Attraction a=new Attraction(elements[0],elements[1], elements[2],elements[3],elements[4],elements[5],elements[6]);
            attractionsOhrid.add(a);

        }
    }

}


