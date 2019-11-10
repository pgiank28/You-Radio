package com.pgiankoulidis.you_radio.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class createRadio{

    @Autowired
    songRepo repo;

    @Autowired
    searchRequest sq;


    public void saveRadioSongs(List<song> losongs){
            losongs.forEach(song->{
                repo.save(song);
            });
    }

    public List<song> radioSongs(String query){
        List<song> mylist = new LinkedList<song>();

        StringBuffer sbf = sq.searchYoutube(query);

        try{
          BufferedWriter bwr = new BufferedWriter(new FileWriter(new File("~/Documents/You-Radio/src/main/resources/templates/googl.html")));
          bwr.write(sbf.toString());
          bwr.flush();
          bwr.close();
        }catch(Exception e){
            System.out.println("exception occured");
        }

        return mylist;
    }
}
