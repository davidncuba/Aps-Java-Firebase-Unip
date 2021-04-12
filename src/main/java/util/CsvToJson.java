/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.opencsv.CSVReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import java.util.HashMap;
import java.util.Map;
import model.EspeciesModel;

public class CsvToJson {

    private final FirebaseDatabase database = FirebaseDatabase.getInstance();
    private final DatabaseReference especiesRef = database.getReference().child("especies");

    public CsvToJson() {
        csvToJson();
    }

    private void csvToJson() {

        String site = "http://dados.mma.gov.br/dataset/41a79b71-445f-4a6a-8c70-d46af991292a/resource/1f13b062-f3f6-4198-a4c5-3581548bebec/download/lista-de-especies-ameacas-2020.csv";
        try {
            URL stockURL = new URL(site);
            BufferedReader reader = new BufferedReader(new InputStreamReader(stockURL.openStream()));

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
                especies.put(number_to_string.toString(), especie);

            }
            especiesRef.setValueAsync(especies);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
