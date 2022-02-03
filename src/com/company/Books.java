package com.company;

public class Books extends ElementOfCloset{
    private String typeOfBook;
    private int valueOfPages;


    /** private/public/protected без ничего = плохо **/
    Books(){
        super();
        typeOfBook="No type";
        valueOfPages = 0;
    }
    Books(String name){
        super(name);
        this.cost = 0;
        this.size = 0;
        this.typeOfBook = "No type";
        this.valueOfPages = 0;
    }
    Books(String name, int cost){
        super(name,cost);
        this.size = 0;
        this.typeOfBook = "No type";
        this.valueOfPages = 0;
    }
    Books(String name, int cost,int size){
        super(name, cost, size);
        this.typeOfBook = "No type";
        this.valueOfPages = 0;
    }
    Books(String name, int cost,int size,String typeOfBook){
        super(name, cost, size);
        this.typeOfBook = typeOfBook;
        this.valueOfPages = 0;
    }
    Books(String name, int cost,int size,String typeOfBook,int valueOfPages){
        super(name, cost, size);
        this.typeOfBook = typeOfBook;
        this.valueOfPages = valueOfPages;
    }

    public void setTypeOfBook(String typeOfBook){this.typeOfBook = typeOfBook;}
    public void setValueOfPages(int valueOfPages){this.valueOfPages = valueOfPages;}


    public String getTypeOfBook(){return typeOfBook;}
    public int getValueOfPages(){return valueOfPages;}


    /** (ctrl + клик на метод и тебя переведет на него) *
     * а почему в этому методе ты не юзаешь этот оверрайд? {@link Closet#printInfoAboutBooks()}
     * идея хорошая, только есть готовая реализация {@link java.lang.Object#toString()} , надо только оверрайднуть (все объекты по умолчанию extends Object)**/
    @Override
    public void printInfo(){
        System.out.println("Name: "+getName()+"    "+"Cost: "+getCost()+"    "+"Size: "+getSize() +
                "    "+"Type: " + getTypeOfBook() + "    " + "Pages: " + getValueOfPages());
    }

    @Override
    public String toString() {
        return "Books{" +
                "typeOfBook='" + typeOfBook + '\'' +
                ", valueOfPages=" + valueOfPages +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", size=" + size +
                '}';
    }

    /** тут автоподсказка говрит, что лучше было сделать**/
    public static Books[] fill(Books[] temp,Books tepmObj){
        for(int i = 0;i<temp.length;i++){
             temp[i] = tepmObj;
        }
        return temp;
    }
}
