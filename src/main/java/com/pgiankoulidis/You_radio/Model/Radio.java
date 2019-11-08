package com.pgiankoulidis.You_radio.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.PersistenceConstructor;

@Entity
public class Radio{

    @Id
    public int id;
    public int clientId;
    private String query;
    private int rank;
    private String youtube_search;
    private String spotify_search;
    private String deezer_search;

    @PersistenceConstructor
    public Radio(int id, int clientId, String query, int rank, String youtube_search, String spotify_search,
    String deezer_search) {
        this.id = id;
        this.clientId = clientId;
        this.query = query;
        this.rank = rank;
        this.youtube_search = youtube_search;
        this.spotify_search = spotify_search;
        this.deezer_search = deezer_search;
    }

    @Override
    public String toString() {
        return "Radio [clientId=" + clientId + ", deezer_search=" + deezer_search + ", id=" + id + ", query=" + query
                + ", rank=" + rank + ", spotify_search=" + spotify_search + ", youtube_search=" + youtube_search + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getYoutube_search() {
        return youtube_search;
    }

    public void setYoutube_search(String youtube_search) {
        this.youtube_search = youtube_search;
    }

    public String getSpotify_search() {
        return spotify_search;
    }

    public void setSpotify_search(String spotify_search) {
        this.spotify_search = spotify_search;
    }

    public String getDeezer_search() {
        return deezer_search;
    }

    public void setDeezer_search(String deezer_search) {
        this.deezer_search = deezer_search;
    }

   
    
}