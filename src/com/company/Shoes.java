package com.company;

import java.io.Serializable;
import java.util.Arrays;

public class Shoes extends ElementOfCloset {
    private String typeOfShoes;

    public Shoes(){
        super();
        typeOfShoes = "0";
    }


    public Shoes(String name){
        super(name);
        typeOfShoes = "0";
    }
    public Shoes(String name, int cost){
        super(name, cost);
        typeOfShoes = "0";
    }
    public Shoes(String name, int cost, int size){
        super(name, cost, size);
        typeOfShoes = "0";
    }
    public Shoes(String name, int cost, int size, String typeOfShoes){
        super(name, cost, size);
        this.typeOfShoes = typeOfShoes;
    }


    public void setTypeOfShoes(String typeOfShoes){
        this.typeOfShoes=typeOfShoes;
    }

    public String getTypeOfShoes(){
        return this.typeOfShoes;
    }

    @Override
    public void printInfo(){
        System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize() +
                "    "+"Type: " + getTypeOfShoes());
    }

    /*public static void fill(Shoes[] temp, Shoes tepmObj){
        Arrays.fill(temp, tepmObj);
    }*/

    public String toString() {
        return "Shoes{" +
                "typeOfShoes='" + typeOfShoes + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", size=" + size +
                '}';
    }

}
