
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;



public class CsvDownload {

    public static void main(String[] args) throws Exception {
        String st = "http://dados.mma.gov.br/dataset/41a79b71-445f-4a6a-8c70-d46af991292a/resource/1f13b062-f3f6-4198-a4c5-3581548bebec/download/lista-de-especies-ameacas-2020.csv";
        URL stockURL = new URL(st);
        BufferedReader in = new BufferedReader(new InputStreamReader(stockURL.openStream()));
        String s = null;
        
        List<Person> personList = new ArrayList<>();

        while ((s = in.readLine()) != null) {
            System.out.println(s);
            
       
        }
    }
}


