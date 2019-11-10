package com.pgiankoulidis.you_radio.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Component;


@Component
public class searchRequest{

    public StringBuffer searchYoutube(String query){
        try{
            URL url = new URL("https://www.youtube.com/results?search_query="+query);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int status = con.getResponseCode();
            System.out.println(status);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            return content;//System.out.println(content);
        }catch(Exception e){
            System.out.println("COULDNT MAKE a proper youtube query");
            return null;
        }
    }
}
