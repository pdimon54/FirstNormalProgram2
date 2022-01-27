package com.company;

public class Shoes extends ElementOfCloset{
    private String typeOfShoes;

    Shoes(){
        name = "No name";
        cost = 0;
        size = 0;
        typeOfShoes = "0";
    }

    Shoes(String name){
        this.name = name;
        this.cost = 0;
        this.size = 0;
        typeOfShoes = "0";
    }
    Shoes(String name, int cost){
        this.name = name;
        this.cost = cost;
        this.size = 0;
        typeOfShoes = "0";
    }
    Shoes(String name, int cost, int size){
        this.name = name;
        this.cost = cost;
        this.size = size;
        typeOfShoes = "0";
    }
    Shoes(String name, int cost, int size, String typeOfShoes){
        this.name = name;
        this.cost = cost;
        this.size = size;
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

    public static Shoes[] fill(Shoes[] temp,Shoes tepmObj){
        for(int i = 0;i<temp.length;i++){
            temp[i] = tepmObj;
        }
        return temp;
    }

}
