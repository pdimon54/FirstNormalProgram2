package com.company;
import java.util.Scanner;

public class Closet {

    private Books[] booksInCloset;
    private Clothes[] clothesInCloset;
    private Drinkables[] drinkablesInCloset;
    private Food[] foodInCloset;
    private Shoes[] shoesInCloset;

    Closet(int booksValue,int clothesValue,int drinkValue,int foodValue,int shoesValue){
        booksInCloset = new Books[booksValue];
        Books tempBook = new Books();
        Books.fill(booksInCloset,tempBook);

        clothesInCloset = new Clothes[clothesValue];
        Clothes tempClothes = new Clothes();
        Clothes.fill(clothesInCloset,tempClothes);

        drinkablesInCloset = new Drinkables[drinkValue];
        Drinkables tempDrink = new Drinkables();
        Drinkables.fill(drinkablesInCloset,tempDrink);

        foodInCloset = new Food[foodValue];
        Food tempFood = new Food();
        Food.fill(foodInCloset,tempFood);

        shoesInCloset = new Shoes[shoesValue];
        Shoes tempShoes = new Shoes();
        Shoes.fill(shoesInCloset,tempShoes);

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

    public void printInfoAboutShoes(){
        for (int i = 0;i<shoesInCloset.length;i++){
            System.out.println("Name: "+shoesInCloset[i].getName()+"    "+"Cost: "+shoesInCloset[i].getCost()
                    +"    "+"Size: "+shoesInCloset[i].getSize() +
                    "    "+"Type: " + shoesInCloset[i].getTypeOfShoes());
        }
    }

    public void printInfoAboutBooks(){
        for (int i = 0;i<booksInCloset.length;i++){
            System.out.println("Name: "+booksInCloset[i].getName()+"    "+"Cost: "+booksInCloset[i].getCost()
                    +"    "+"Size: "+booksInCloset[i].getSize() +
                    "    "+"Type: " + booksInCloset[i].getTypeOfBook());
        }
    }

    public void printInfoAboutClothes(){
        for (int i = 0;i<clothesInCloset.length;i++){
            System.out.println("Name: "+clothesInCloset[i].getName()+"    "+"Cost: "+clothesInCloset[i].getCost()
                    +"    "+"Size: "+clothesInCloset[i].getSize() +
                    "    "+"Old: " + clothesInCloset[i].getClothesOld());
        }
    }

    public void printInfoAboutDrinks(){
        for (int i = 0;i<drinkablesInCloset.length;i++){
            System.out.println("Name: "+drinkablesInCloset[i].getName()+"    "+"Cost: "+drinkablesInCloset[i].getCost()
                    +"    "+"Size: "+drinkablesInCloset[i].getSize() +
                    "    "+"Type: " + drinkablesInCloset[i].getTypeOfAlcohol() +
                    "    "+"Capacity: " + drinkablesInCloset[i].getCapacityOfAlcohol());
        }
    }
    public void printInfoAboutFoods(){
        for (int i = 0;i<foodInCloset.length;i++){
            System.out.println("Name: "+foodInCloset[i].getName()+"    "+"Cost: "+foodInCloset[i].getCost()
                    +"    "+"Size: "+foodInCloset[i].getSize() +
                    "    "+"Date: " + foodInCloset[i].getExperationDate());
        }
    }

    public void printInfoAboutCloset(){
        System.out.println("=====================================================");
        System.out.println("Books:");
        printInfoAboutBooks();
        System.out.println("Clothes:");
        printInfoAboutClothes();
        System.out.println("Drinks:");
        printInfoAboutDrinks();
        System.out.println("Foods:");
        printInfoAboutFoods();
        System.out.println("Shoes:");
        printInfoAboutShoes();
        System.out.println("=====================================================");
    }
}
