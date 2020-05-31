package com.example.java;

import com.example.java.model.Olive;
import com.example.java.model.OliveName;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.*;
import java.util.ArrayList;

public class Main {

//here olives are beeing created and given their values
    public static void main(String[] args) {
        //instance of a list interface   - List
        //type of the members of a list  - Olive
        //olives instanciete it with ArrayList
//        List<Olive> olives = new ArrayList<>();
//
//        Olive olive1 = new Olive();
//        olives.add(olive1); //adding olive to the list
//        Olive olive2 = new Olive();
//        olive2.setOil(1);//small olive
//        olives.add(olive2); //adding olive to the list
//        Olive olive3 = new Olive();
//        olive3.setOil(4);
//        olives.add(olive3); //adding olive to the list


        //program after change
        List<Olive> olives = new ArrayList<>();

//        Olive olive1 = new Olive("Kalamata", 0x2E0854, 3);
//        olives.add(olive1); //adding olive to the list
//        Olive olive2 = new Olive("Kalamata", 0x2E0854, 1);
//
//        olives.add(olive2); //adding olive to the list
//        Olive olive3 = new Olive("Ligurian", 0x000000, 4);
//        olives.add(olive3); //adding olive to the list



        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 3)); //adding olive to the list
        olives.add(new Olive(OliveName.KALAMATA, 0x2E0854, 1)); //adding olive to the list
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 4)); //adding olive to the list
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 4)); //adding olive to the list
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 4)); //adding olive to the list
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 4)); //adding olive to the list
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 4)); //adding olive to the list
        olives.add(new Olive(OliveName.LIGURIAN, 0x000000, 4)); //adding olive to the list




        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total extraction: "+totalOil );
    }

}

