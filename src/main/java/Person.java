/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Person {
    
    public Person(){
       
    }
public class Country {

    @CsvBindByPosition(position = 0)
    private String startIp;

    @CsvBindByPosition(position = 1)
    private String endIp;

    @CsvBindByPosition(position = 2)
    private String countryCode;

    @CsvBindByPosition(position = 3)
    private String country;

    //  getters, setters, toString
}
 public static void main(String[] args) throws IOException {

        String fileName = "data.csv";

        List<Country> beans = new CsvToBeanBuilder(new FileReader(fileName))
                .withType(Country.class)
                .build()
                .parse();

        beans.forEach(System.out::println);

    }
}

