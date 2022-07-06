package com.br.api.model;

public class Player {

    // Classe model do jogador
    private String name;
    private Integer coordX;
    private Integer coordY;
    private String status;
    private String color;

    public Player() {
    }

    public Player(String name, Integer coordX, Integer coordY, String status, String color) {
        this.name = name;
        this.coordX = coordX;
        this.coordY = coordY;
        this.status = status;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCoordX() {
        return coordX;
    }

    public void setCoordX(Integer coordX) {
        this.coordX = coordX;
    }

    public Integer getCoordY() {
        return coordY;
    }

    public void setCoordY(Integer coordY) {
        this.coordY = coordY;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
