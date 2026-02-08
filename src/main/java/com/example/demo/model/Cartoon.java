package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cartoon")
public class Cartoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private int episodes;
    private String studio;

    public Cartoon() {
    }

    public Cartoon(String name, int episodes, String studio) {
        this.name = name;
        this.episodes = episodes;
        this.studio = studio;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEpisodes() {
        return episodes;
    }

    public String getStudio() {
        return studio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
}
