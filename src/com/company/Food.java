package com.company;

import java.io.Serializable;
import java.util.Arrays;

public class Food extends ElementOfCloset {
    private int experationDate;

    public Food(){
        super();
        this.experationDate = 0;
    }
    public Food(String name){
        super(name);
        this.experationDate = 0;
    }
    public Food(String name, int cost){
        super(name, cost);
        this.experationDate = 0;
    }
    public Food(String name, int cost, int size){
        super(name, cost, size);
        this.experationDate = 0;
    }
    public Food(String name, int cost, int size,int experationDate){
        super(name, cost, size);
        this.experationDate = experationDate;
    }


    public void setExperationDate(int experationDate){
        this.experationDate=experationDate;
    }

    public int getExperationDate(){
        return this.experationDate;
    }

    @Override
    public void printInfo(){
        System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize() +
                "    "+"Date: " + getExperationDate());
    }

    /*public static void fill(Food[] temp,Food tepmObj){
        Arrays.fill(temp, tepmObj);
    }*/

    public String toString() {
        return "Foods{" +
                ", experation date=" + experationDate +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", size=" + size +
                '}';
    }
}

