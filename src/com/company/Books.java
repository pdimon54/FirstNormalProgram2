package com.company;

public class Books extends ElementOfCloset{
    private String typeOfBook;
    private int valueOfPages;


    Books(){
        typeOfBook="No type";
        valueOfPages = 0;
    }
    Books(String name){
        this.name = name;
        this.cost = 0;
        this.size = 0;
        this.typeOfBook = "No type";
        this.valueOfPages = 0;
    }
    Books(String name, int cost){
        this.name = name;
        this.cost = cost;
        this.size = 0;
        this.typeOfBook = "No type";
        this.valueOfPages = 0;
    }
    Books(String name, int cost,int size){
        this.name = name;
        this.cost = cost;
        this.size = size;
        this.typeOfBook = "No type";
        this.valueOfPages = 0;
    }
    Books(String name, int cost,int size,String typeOfBook){
        this.name = name;
        this.cost = cost;
        this.size = size;
        this.typeOfBook = typeOfBook;
        this.valueOfPages = 0;
    }
    Books(String name, int cost,int size,String typeOfBook,int valueOfPages){
        this.name = name;
        this.cost = cost;
        this.size = size;
        this.typeOfBook = typeOfBook;
        this.valueOfPages = valueOfPages;
    }

    public void setTypeOfBook(String typeOfBook){this.typeOfBook = typeOfBook;}
    public void setValueOfPages(int valueOfPages){this.valueOfPages = valueOfPages;}


    public String getTypeOfBook(){return typeOfBook;}
    public int getValueOfPages(){return valueOfPages;}


    @Override
    public void printInfo(){
        System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize() +
                "    "+"Type: " + getTypeOfBook() + "    " + "Pages: " + getValueOfPages());
    }

    public static Books[] fill(Books[] temp,Books tepmObj){
        for(int i = 0;i<temp.length;i++){
             temp[i] = tepmObj;
        }
        return temp;
    }
}
