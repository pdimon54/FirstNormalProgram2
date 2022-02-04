package com.company;

import java.io.Serializable;
import java.util.Arrays;

public class Drinkables extends ElementOfCloset {

        private String typeOfAlcohol;
        private int capacityOfAlcohol;

    public Drinkables(){
            super();
            this.typeOfAlcohol = "No type";
            this.capacityOfAlcohol = 0;
        }
    public Drinkables(String name){
            super(name);
            this.typeOfAlcohol = "No type";
            this.capacityOfAlcohol = 0;
        }
    public Drinkables(String name, int cost){
            super(name, cost);
            this.typeOfAlcohol = "No type";
            this.capacityOfAlcohol = 0;
        }
    public Drinkables(String name, int cost, int size){
            super(name, cost, size);
            this.typeOfAlcohol = "No type";
            this.capacityOfAlcohol = 0;
        }
    public Drinkables(String name, int cost, int size,String typeOfAlcohol){
            super(name, cost, size);
            this.typeOfAlcohol = typeOfAlcohol;
            this.capacityOfAlcohol = 0;
        }
    public Drinkables(String name, int cost, int size,String typeOfAlcohol, int capacityOfAlcohol){
            super(name, cost, size);
            this.typeOfAlcohol = typeOfAlcohol;
            this.capacityOfAlcohol = capacityOfAlcohol;
        }

        public void setTypeOfAlcohol(String typeOfAlcohol){this.typeOfAlcohol=typeOfAlcohol;}
        public void setCapacityOfAlcohol(int capacityOfAlcohol){this.capacityOfAlcohol=capacityOfAlcohol;}

        public String getTypeOfAlcohol(){return typeOfAlcohol;}
        public int getCapacityOfAlcohol(){return capacityOfAlcohol;}

        @Override
        public void printInfo(){
            System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize() +
                    "    "+"Type: " + getTypeOfAlcohol() + "    " + "Capacity: " + getCapacityOfAlcohol());
        }

    /*public static void fill(Drinkables[] temp, Drinkables tepmObj){
        Arrays.fill(temp, tepmObj);
    }*/

    public String toString() {
        return "Drinks{" +
                "typeOfAlcohol='" + typeOfAlcohol + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", size=" + size +
                '}';
    }
}
