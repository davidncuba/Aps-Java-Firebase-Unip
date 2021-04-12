/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Country;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 *
 * @author davidcuba
 */
public class Visitors {

     @CsvBindByPosition(position = 0)
     private String firstName;

     @CsvBindByPosition(position = 1)
     private String lastName;

//     @CsvBindByPosition(position = 2)
//     private int visitsToWebsite;

     // Getters and setters go here.
     
     public static void main(String[] args) throws FileNotFoundException {
        List<Visitors> beans = new CsvToBeanBuilder(new FileReader("data.csv"))
       .withType(Visitors.class).build().parse();
        
         System.out.println(beans);
    }
     }
