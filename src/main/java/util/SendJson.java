/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author davidcuba
 */
public class SendJson {
    public SendJson(String Method, String value){
        post(Method, value);
    }
    private void post(String Method, String value){
         try {
            URL url = new URL("https://aps-2021-unip-default-rtdb.firebaseio.com/especies.json");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod(Method);
            con.setRequestProperty("Content-Type", "application/json; utf-8");
            con.setRequestProperty("Accept", "application/json");
            con.setDoOutput(true);
            String jsonInputString = value;

            try (OutputStream os = con.getOutputStream()) {
                byte[] input = jsonInputString.getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            try (BufferedReader br = new BufferedReader(
                new InputStreamReader(con.getInputStream(), "utf-8"))) {
            StringBuilder response = new StringBuilder();
            String responseLine = null;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            System.out.println(response.toString());
        }catch(Exception e){
        }

        } catch (Exception e) {

        }
        
    }
}
