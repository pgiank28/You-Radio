package com.pgiankoulidis.You_radio.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component("createRadio")
public class createRadio{

    @Autowired
    songRepo repo;

    public void saveRadioSongs(List<song> losongs){
            losongs.forEach(song->{
                repo.save(song);
            });
    }

    public List<song> radioSongs(String query){
        List<song> mylist = new LinkedList<song>();
        return mylist;
    }
}