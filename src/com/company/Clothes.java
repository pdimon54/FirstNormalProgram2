package com.company;


public class Clothes extends ElementOfCloset{

    private int clothesOld;

    /** private/public/protected без ничего = плохо **/
    Clothes(){
        name = "No name";
        cost = 0;
        size = 0;
        clothesOld = 0;
    }
/** super(...) **/
    Clothes(String name){
        this.name = name;
        this.cost = 0;
        this.size = 0;
        this.clothesOld = 0;
    }
    Clothes(String name, int cost){
        this.name = name;
        this.cost = cost;
        this.size = 0;
        this.clothesOld = 0;
    }
    Clothes(String name, int cost, int size){
        this.name = name;
        this.cost = cost;
        this.size = size;
        this.clothesOld = 0;
    }
    Clothes(String name, int cost, int size, int clothesOld){
        this.name = name;
        this.cost = cost;
        this.size = size;
        this.clothesOld = clothesOld;
    }

    public void setClothesOld(int clothesOld){
        this.clothesOld = clothesOld;
    }

    public int getClothesOld(){
        return clothesOld;
    }

    /** (ctrl + клик на метод и тебя переведет на него) *
     * а почему в этому методе ты не юзаешь этот оверрайд? {@link Closet#printInfoAboutBooks()}
     * идея хорошая, только есть готовая реализация {@link java.lang.Object#toString()} , надо только оверрайднуть (все объекты по умолчанию extends Object)**/
    @Override
    public void printInfo(){
        System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize() +
                "    "+"Clothes old: "+getClothesOld());
    }


    /** тут автоподсказка говрит, что лучше было сделать**/
    public static Clothes[] fill(Clothes[] temp,Clothes tepmObj){
        for(int i = 0;i<temp.length;i++){
            temp[i] = tepmObj;
        }
        return temp;
    }

}
