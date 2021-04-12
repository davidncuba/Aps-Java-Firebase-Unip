/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Country;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

/**
 *
 * @author davidcuba
 */
public class Country {
    
    public Country(){
      
    }
    @CsvBindByName(column = "a")
    private String a;


}
