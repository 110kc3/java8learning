package com.example.java.model;

public enum OliveName {

    KALAMATA("Kalamata"), LIGURIAN("Ligurian");

    private String name;

    OliveName(String name){
        this.name = name;
    }

    //to display string when enum is called

    @Override
    public String toString() {
        return name;
    }
}
