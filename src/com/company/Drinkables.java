package com.company;

public class Drinkables extends ElementOfCloset {

        private String typeOfAlcohol;
        private int capacityOfAlcohol;
        Drinkables(){
            this.name = "0";
            this.cost = 0;
            this.size = 0;
            this.typeOfAlcohol = "No type";
            this.capacityOfAlcohol = 0;
        }
        Drinkables(String name){
            this.name = name;
            this.cost = 0;
            this.size = 0;
            this.typeOfAlcohol = "No type";
            this.capacityOfAlcohol = 0;
        }
        Drinkables(String name, int cost){
            this.name = name;
            this.cost = cost;
            this.size = 0;
            this.typeOfAlcohol = "No type";
            this.capacityOfAlcohol = 0;
        }
        Drinkables(String name, int cost, int size){
            this.name = name;
            this.cost = cost;
            this.size = size;
            this.typeOfAlcohol = "No type";
            this.capacityOfAlcohol = 0;
        }
        Drinkables(String name, int cost, int size,String typeOfAlcohol){
            this.name = name;
            this.cost = cost;
            this.size = size;
            this.typeOfAlcohol = typeOfAlcohol;
            this.capacityOfAlcohol = 0;
        }
        Drinkables(String name, int cost, int size,String typeOfAlcohol, int capacityOfAlcohol){
            this.name = name;
            this.cost = cost;
            this.size = size;
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


    public static Drinkables[] fill(Drinkables[] temp,Drinkables tepmObj){
        for(int i = 0;i<temp.length;i++){
            temp[i] = tepmObj;
        }
        return temp;
    }
}
