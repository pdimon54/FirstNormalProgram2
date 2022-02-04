package com.company;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

public class Closet implements Serializable {

    private Books[] booksInCloset;
    private Clothes[] clothesInCloset;
    private Drinkables[] drinkablesInCloset;
    private Food[] foodInCloset;
    private Shoes[] shoesInCloset;

    Closet(int booksValue,int clothesValue,int drinkValue,int foodValue,int shoesValue){
        booksInCloset = new Books[booksValue];
        Books tempBook = new Books();
        Arrays.fill(booksInCloset,tempBook);

        clothesInCloset = new Clothes[clothesValue];
        Clothes tempClothes = new Clothes();
        Arrays.fill(clothesInCloset,tempClothes);

        drinkablesInCloset = new Drinkables[drinkValue];
        Drinkables tempDrink = new Drinkables();
        Arrays.fill(drinkablesInCloset,tempDrink);

        foodInCloset = new Food[foodValue];
        Food tempFood = new Food();
        Arrays.fill(foodInCloset,tempFood);

        shoesInCloset = new Shoes[shoesValue];
        Shoes tempShoes = new Shoes();
        Arrays.fill(shoesInCloset,tempShoes);

    }


    public void setBooksInCloset(Books[] booksInCloset) {this.booksInCloset = booksInCloset;}
    public void setClothesInCloset(Clothes[] clothesInCloset){this.clothesInCloset = clothesInCloset;}
    public void setDrinkablesInCloset(Drinkables[] drinkablesInCloset){this.drinkablesInCloset = drinkablesInCloset;}
    public void setFoodInCloset(Food[] foodInCloset){this.foodInCloset = foodInCloset;}
    public void setShoesInCloset(Shoes[] shoesInCloset){this.shoesInCloset = shoesInCloset;}

    public Books[] getBooksInCloset(){return booksInCloset;}
    public Clothes[] getClothesInCloset(){return clothesInCloset;}
    public Drinkables[] getDrinkablesInCloset(){return  drinkablesInCloset;}
    public Food[] getFoodInCloset(){return foodInCloset;}
    public Shoes[] getShoesInCloset(){return shoesInCloset;}

    public void addBook(int arrIndex){
        System.out.println("Param of the book:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Type:");
        String typeOfBook = scanner.nextLine();
        System.out.println("Cost:");
        int cost = scanner.nextInt();
        System.out.println("Size");
        int size = scanner.nextInt();
        System.out.println("Pages:");
        int valueOfPages = scanner.nextInt();
        Books newBook = new Books(name,cost,size,typeOfBook,valueOfPages);
        booksInCloset[arrIndex] = newBook;
    }
    public void addClothes(int arrIndex){
        System.out.println("Param of the clothes:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Cost:");
        int cost = scanner.nextInt();
        System.out.println("Size:");
        int size = scanner.nextInt();
        System.out.println("Old:");
        int clothesOld = scanner.nextInt();
        Clothes newClothes = new Clothes(name,cost,size,clothesOld);
        clothesInCloset[arrIndex] = newClothes;
    }
    public void addDrink(int arrIndex){
        System.out.println("Param of the drink:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Type:");
        String typeOfAlcohol = scanner.nextLine();
        System.out.println("Cost:");
        int cost = scanner.nextInt();
        System.out.println("Size");
        int size = scanner.nextInt();
        System.out.println("Capacity:");
        int capacityOfAlcohol = scanner.nextInt();
        Drinkables newDrink = new Drinkables(name,cost,size,typeOfAlcohol,capacityOfAlcohol);
        drinkablesInCloset[arrIndex] = newDrink;
    }
    public void addFood(int arrIndex){
        System.out.println("Param of the food:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Cost:");
        int cost = scanner.nextInt();
        System.out.println("Size:");
        int size = scanner.nextInt();
        System.out.println("Date:");
        int experationDate = scanner.nextInt();
        Food newFood = new Food(name,cost,size,experationDate);
        foodInCloset[arrIndex] = newFood;
    }
    public void addShoes(int arrIndex){
        System.out.println("Param of the shoes:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Type:");
        String typeOfShoes = scanner.nextLine();
        System.out.println("Cost:");
        int cost = scanner.nextInt();
        System.out.println("Size:");
        int size = scanner.nextInt();
        Shoes newShoes = new Shoes(name,size,cost,typeOfShoes);
        shoesInCloset[arrIndex] = newShoes;
    }

    /*public void printInfoAboutShoes(){
        for (Shoes shoes : shoesInCloset) {
            shoes.toString();
        }
    }

    public void printInfoAboutBooks(){
        for (Books books : booksInCloset) {
            books.toString();
        }
    }

    public void printInfoAboutClothes(){
        for (Clothes clothes : clothesInCloset) {
            clothes.toString();
        }
    }

    public void printInfoAboutDrinks(){
        for (Drinkables drinkables : drinkablesInCloset) {
            drinkables.toString();
        }
    }
    public void printInfoAboutFoods(){
        for (Food food : foodInCloset) {
            food.toString();
        }
    }*/

    public void printInfoAboutCloset(){
        System.out.println("=====================================================");
        System.out.println("Books:" + Arrays.toString(booksInCloset));
        System.out.println("Clothes: " + Arrays.toString(clothesInCloset));
        System.out.println("Drinks:" + Arrays.toString(drinkablesInCloset));
        System.out.println("Foods:" + Arrays.toString(foodInCloset));
        System.out.println("Shoes:" + Arrays.toString(shoesInCloset));
        System.out.println("=====================================================");
    }

}
