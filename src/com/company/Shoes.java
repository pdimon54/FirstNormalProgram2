package com.company;

public class Shoes extends ElementOfCloset{
    private String typeOfShoes;

    public Shoes(){
        name = "No name";
        cost = 0;
        size = 0;
        typeOfShoes = "0";
    }

    /** private/public/protected без ничего = плохо **/
    /** super(...) **/
    public Shoes(String name){
        this.name = name;
        this.cost = 0;
        this.size = 0;
        typeOfShoes = "0";
    }
    public Shoes(String name, int cost){
        this.name = name;
        this.cost = cost;
        this.size = 0;
        typeOfShoes = "0";
    }
    public Shoes(String name, int cost, int size){
        this.name = name;
        this.cost = cost;
        this.size = size;
        typeOfShoes = "0";
    }
    public Shoes(String name, int cost, int size, String typeOfShoes){
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
    /** (ctrl + клик на метод и тебя переведет на него) *
     * а почему в этому методе ты не юзаешь этот оверрайд? {@link Closet#printInfoAboutBooks()}
     * идея хорошая, только есть готовая реализация {@link java.lang.Object#toString()} , надо только оверрайднуть (все объекты по умолчанию extends Object)**/
    public void printInfo(){
        System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize() +
                "    "+"Type: " + getTypeOfShoes());
    }

    /** тут автоподсказка говрит, что лучше было сделать**/
    public static Shoes[] fill(Shoes[] temp,Shoes tepmObj){
        for(int i = 0;i<temp.length;i++){
            temp[i] = tepmObj;
        }
        return temp;
    }

}
