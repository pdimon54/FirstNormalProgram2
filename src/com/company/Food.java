package com.company;

public class Food extends ElementOfCloset {
    private int experationDate;


    /** private/public/protected без ничего = плохо **/
    /** super(...) **/
    Food(){
        this.name = "0";
        this.cost = 0;
        this.size = 0;
        this.experationDate = 0;
    }
    Food(String name){
        this.name = name;
        this.cost = 0;
        this.size = 0;
        this.experationDate = 0;
    }
    Food(String name, int cost){
        this.name = name;
        this.cost = cost;
        this.size = 0;
        this.experationDate = 0;
    }
    Food(String name, int cost, int size){
        this.name = name;
        this.cost = cost;
        this.size = size;
        this.experationDate = 0;
    }
    Food(String name, int cost, int size,int experationDate){
        this.name = name;
        this.cost = cost;
        this.size = size;
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

    /** тут автоподсказка говрит, что лучше было сделать**/
    public static Food[] fill(Food[] temp,Food tepmObj){
        for(int i = 0;i<temp.length;i++){
            temp[i] = tepmObj;
        }
        return temp;
    }
}

