package com.example.java.model;

//this class does all the work - tells the other classes how much oil olive has
public class Olive {

//    //constant variables
//    public static final String KALAMATA = "Kalamata";
//    public static final String LIGURIAN = "Ligurian";

    private OliveName name = OliveName.KALAMATA;
    private long color = 0x2E0854;
    private int oil = 3;


    public Olive(){} //no arguments constructor - just to satisfy compiler rules

    public Olive(OliveName name, long color, int oil){
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    //instance methods
    //getter - accessor method (they return the value)
    //setter - modifier method (they receive the argument)

    public OliveName getName() {
        return name;
    }

    public void setName(OliveName name) {
        //this is used to distinguish instance var from argument
        this.name = name;
    }

    public long getColor() {
        return color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        System.out.println("Ouch!");
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }
}
