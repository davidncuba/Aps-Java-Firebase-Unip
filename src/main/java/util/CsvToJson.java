/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.opencsv.CSVReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import model.EspeciesModel;

public class CsvToJson {

    private static final String SAMPLE_CSV_FILE_PATH = "./data.csv";
    private final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private final DatabaseReference especiesRef = database.getReference().child("especies");
    public CsvToJson(){
        csvToJson();
    }
    private void csvToJson() {
        
        //Create the Ref Child Firebase
        
final FirebaseDatabase database = FirebaseDatabase.getInstance();
    
        try{
              Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVReader csvReader = new CSVReader(reader, ';'); 

            // Reading Records One by One in a String array
            String[] nextRecord;
            csvReader.readNext();
           
           int i = 0;
           Map<String, EspeciesModel> especies = new HashMap<>();
            while ((nextRecord = csvReader.readNext()) != null) {
                i++;
                
                Integer number_to_string = new Integer(i);
               
                //Create the Object Espécies
                EspeciesModel especie = new EspeciesModel();
                
                especie.setFaunaFlora(nextRecord[0]);
                especie.setGrupo(nextRecord[1]);
                especie.setFamilia(nextRecord[2]);
                especie.setEspecie(nextRecord[3]);
                especie.setNomeComum(nextRecord[4]);
                especie.setCategoriaDeAmeaca(nextRecord[5]);
                especie.setSiglaCategoriaDeAmeaca(nextRecord[6]);
                especie.setBioma(nextRecord[7]);
                especie.setPrincipaisAmeacas(nextRecord[8]);
                especie.setPresencaEmAreasProtegidas(nextRecord[9]);
                especie.setPlanoDeAcaoNacional(nextRecord[10]);
                especie.setOrdenamentoPesqueiro(nextRecord[11]);
                especie.setNivelDeProtecao(nextRecord[12]);
                especie.setEspecieExclusivaBrasil(nextRecord[13]);
                especie.setEstados(nextRecord[14]);
                especies.put(number_to_string.toString(),especie);

            }
            especiesRef.setValueAsync(especies);
            

         
        }
       catch (IOException e){
           System.out.println(e);
       }
    }

    
    }


