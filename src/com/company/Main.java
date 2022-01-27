package com.company;

import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
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
            System.out.println(" ");
            System.out.println("Main menu");
            System.out.println("1- Books");
            System.out.println("2- Clothes");
            System.out.println("3- Drink");
            System.out.println("4- Food");
            System.out.println("5- Shoes");
            System.out.println("6- Show all info about your closet");
            //System.out.println("7- Write info to the file");
            System.out.println("8- exit");
            System.out.println(" ");
            System.out.println(" ");
            numberSearch = scanner.nextInt();
            switch(numberSearch)
            {
                case 1:
                    System.out.println("Choes: 1 - add element    2 - show all books");
                    int choes1 = scanner.nextInt();
                    if(choes1 == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=bookLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addBook(arrIndex);
                    }
                    if (choes1 == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutBooks();
                        System.out.println("==================================");
                    }
                    else System.out.println("You choes is incorrect");
                    break;
                case 2:
                    System.out.println("Choes: 1 - add element    2 - show all clothes");
                    int choes2 = scanner.nextInt();
                    if(choes2 == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=clothesLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addClothes(arrIndex);
                    }
                    if (choes2 == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutClothes();
                        System.out.println("==================================");
                    }
                    else System.out.println("You choes is incorrect");
                    break;
                case 3:
                    System.out.println("Choes: 1 - add element    2 - show all drinks");
                    int choes3 = scanner.nextInt();
                    if(choes3 == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=drinkLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addDrink(arrIndex);
                    }
                    if (choes3 == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutDrinks();
                        System.out.println("==================================");
                    }
                    else System.out.println("You choes is incorrect");
                    break;
                case 4:
                    System.out.println("Choes: 1 - add element    2 - show all foods");
                    int choes4 = scanner.nextInt();
                    if(choes4 == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=foodLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addFood(arrIndex);
                    }
                    if (choes4 == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutFoods();
                        System.out.println("==================================");
                    }
                    else System.out.println("You choes is incorrect");
                    break;
                case 5:
                    System.out.println("Choes: 1 - add element    2 - show all shoes");
                    int choes5 = scanner.nextInt();
                    if(choes5 == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=shoesLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addShoes(arrIndex);
                    }
                    if (choes5 == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutShoes();
                        System.out.println("==================================");
                    }
                    else System.out.println("You choes is incorrect");
                    break;
                case 6:
                    closet.printInfoAboutCloset();
                    break;
                case 7:
                    /*FileWork of = new FileWork();
                    of.writeAllInfoToFile(closet);
                    break;*/
                case 8:
                    System.exit(0);
                    break;

            }
        } while(numberSearch!=8);
    }
}
