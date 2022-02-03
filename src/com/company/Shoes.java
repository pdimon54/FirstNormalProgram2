package com.company;

import java.util.Arrays;

public class Shoes extends ElementOfCloset{
    private String typeOfShoes;

    public Shoes(){
        super();
        typeOfShoes = "0";
    }

    /** private/public/protected без ничего = плохо **/

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
    /** (ctrl + клик на метод и тебя переведет на него) *
     * а почему в этому методе ты не юзаешь этот оверрайд? {@link Closet#printInfoAboutBooks()}
     * идея хорошая, только есть готовая реализация {@link java.lang.Object#toString()} , надо только оверрайднуть (все объекты по умолчанию extends Object)**/
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
