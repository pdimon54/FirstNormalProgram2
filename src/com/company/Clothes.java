package com.company;


import java.util.Arrays;

public class Clothes extends ElementOfCloset{

    private int clothesOld;

    /** private/public/protected без ничего = плохо **/
    Clothes(){
        super();
        clothesOld = 0;
    }
    Clothes(String name){
        super(name);
        this.clothesOld = 0;
    }
    Clothes(String name, int cost){
        super(name,cost);
        this.clothesOld = 0;
    }
    Clothes(String name, int cost, int size){
        super(name, cost, size);
        this.clothesOld = 0;
    }
    Clothes(String name, int cost, int size, int clothesOld){
        super(name, cost, size);
        this.clothesOld = clothesOld;
    }

    public void setClothesOld(int clothesOld){
        this.clothesOld = clothesOld;
    }

    public int getClothesOld(){
        return clothesOld;
    }

    /** (ctrl + клик на метод и тебя переведет на него) *
     * а почему в этому методе ты не юзаешь этот оверрайд?
     * идея хорошая, только есть готовая реализация {@link java.lang.Object#toString()} , надо только оверрайднуть (все объекты по умолчанию extends Object)**/
    @Override
    public void printInfo(){
        System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize() +
                "    "+"Clothes old: "+getClothesOld());
    }

    /*public static void fill(Clothes[] temp, Clothes tepmObj){
        Arrays.fill(temp, tepmObj);
    }*/

    public String toString() {
        return "Clothes{" +
                ", clothesOld=" + clothesOld +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", size=" + size +
                '}';
    }
}
