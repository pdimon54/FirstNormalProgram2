package com.company;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Parameters of closet (Book,Clothes,Drink,Food,Shoes):");
        Scanner scanner = new Scanner(System.in);
        int bookLength = scanner.nextInt();
        int clothesLength = scanner.nextInt();
        int drinkLength = scanner.nextInt();
        int foodLength = scanner.nextInt();
        int shoesLength = scanner.nextInt();
		Closet closet = new Closet(bookLength,clothesLength,drinkLength,foodLength,shoesLength);
        int numberSearch;
        do
        {
            printMainMenu();
            numberSearch = scanner.nextInt();
            switch(numberSearch)
            {
                case 1:
                    caseBooks(closet,bookLength);
                    break;
                case 2:
                    caseClothes(closet,clothesLength);
                    break;
                case 3:
                    caseDrinks(closet,drinkLength);
                    break;
                case 4:
                    caseFoods(closet,foodLength);
                    break;
                case 5:
                    caseShoes(closet,shoesLength);
                    break;
                case 6:
                    closet.printInfoAboutCloset();
                    break;
                case 7:
                    FileWork of = new FileWork();
                    of.writeAllInfoToFile(closet);
                    break;
                case 8:
                    FileWork save = new FileWork();
                    save.saveData(closet);
                    break;
                case 9:
                    FileWork download = new FileWork();
                    closet = download.downloadData();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please , enter an int from 0 to 10");
                    break;

            }
        } while(numberSearch!=10);
    }

    private static void printMainMenu() {
        System.out.println(" ");
        System.out.println("Main menu");
        System.out.println("1- Books");
        System.out.println("2- Clothes");
        System.out.println("3- Drink");
        System.out.println("4- Food");
        System.out.println("5- Shoes");
        System.out.println("6- Show all info about your closet");
        System.out.println("7- Write info to the .txt file");
        System.out.println("8- Save info about this closet");
        System.out.println("9- Download info about last closet");
        System.out.println("10- exit");
        System.out.println(" ");
        System.out.println(" ");
    }

    private static void caseBooks(Closet closet, int bookLength){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice: 1 - add element    2 - show all books");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Input index:");
            int arrIndex = scanner.nextInt();
            if(arrIndex>=bookLength){
                System.out.println("You write incorrect index");
                return;
            }
            closet.addBook(arrIndex);
        }
        if (choice == 2){
            System.out.println("==================================");
            System.out.println(Arrays.toString(closet.getBooksInCloset()));
            System.out.println("==================================");
        }
        else System.out.println("You Choice is incorrect");
    }

    private static void caseClothes(Closet closet, int clothesLength){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice: 1 - add element    2 - show all clothes");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Input index:");
            int arrIndex = scanner.nextInt();
            if(arrIndex>=clothesLength){
                System.out.println("You write incorrect index");
                return;
            }
            closet.addClothes(arrIndex);
        }
        if (choice == 2){
            System.out.println("==================================");
            System.out.println(Arrays.toString(closet.getClothesInCloset()));
            System.out.println("==================================");
        }
        else System.out.println("You choice is incorrect");
    }
    private static void caseDrinks(Closet closet, int drinkLength){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice: 1 - add element    2 - show all drinks");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Input index:");
            int arrIndex = scanner.nextInt();
            if(arrIndex>=drinkLength){
                System.out.println("You write incorrect index");
                return;
            }
            closet.addDrink(arrIndex);
        }
        if (choice == 2){
            System.out.println("==================================");
            System.out.println(Arrays.toString(closet.getDrinkablesInCloset()));
            System.out.println("==================================");
        }
        else System.out.println("You choice is incorrect");
    }

    private static void caseFoods(Closet closet, int foodLength){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice: 1 - add element    2 - show all foods");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Input index:");
            int arrIndex = scanner.nextInt();
            if(arrIndex>=foodLength){
                System.out.println("You write incorrect index");
                return;
            }
            closet.addFood(arrIndex);
        }
        if (choice == 2){
            System.out.println("==================================");
            System.out.println(Arrays.toString(closet.getFoodInCloset()));
            System.out.println("==================================");
        }
        else System.out.println("You choice is incorrect");
    }
    private static void caseShoes(Closet closet, int shoesLength){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choice: 1 - add element    2 - show all shoes");
        int choice = scanner.nextInt();
        if(choice == 1){
            System.out.println("Input index:");
            int arrIndex = scanner.nextInt();
            if(arrIndex>=shoesLength){
                System.out.println("You write incorrect index");
                return;
            }
            closet.addShoes(arrIndex);
        }
        if (choice == 2){
            System.out.println("==================================");
            System.out.println(Arrays.toString(closet.getShoesInCloset()));
            System.out.println("==================================");
        }
        else System.out.println("You choice is incorrect");
    }

}
