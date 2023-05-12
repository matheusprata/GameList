package com.prata.gamelist.dto;

import com.prata.gamelist.entities.Game;

public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String platforms;
    private String shortDescription;

    public GameMinDTO(){
    }
    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        platforms = entity.getPlatforms();
        shortDescription = entity.getShortDescription();
    }
    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public Integer getYear() {
        return year;
    }
    public String getPlatforms() {
        return platforms;
    }
    public String getShortDescription() {
        return shortDescription;
    }
}