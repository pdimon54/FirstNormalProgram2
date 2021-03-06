package com.company;

import java.io.Serializable;

public class ElementOfCloset implements Serializable {
    protected String name;
    protected int cost;
    protected int size;

    public ElementOfCloset(){this("No name",0,0);}
    public ElementOfCloset(String name){this(name,0,0);}
    public ElementOfCloset(String name, int cost){this(name,cost,0);}
    public ElementOfCloset(String name, int cost, int size){
        this.name = name;
        this.cost = cost;
        this.size = size;
    }

    public void setName(String name){this.name = name;}
    public void setCost(int cost){this.cost = cost;}
    public void setSize(int size){this.size = size;}

    public String getName(){return this.name;}
    public int getCost(){return  this.cost;}
    public int getSize(){return this.size;}

    public void printInfo(){
        System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize());
    }
    public String toString() {
        return "Element{" +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", size=" + size +
                '}';
    }


}
