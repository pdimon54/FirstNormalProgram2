package com.company;

import java.util.Scanner;
import java.lang.*;

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
            printMainMenu();
            numberSearch = scanner.nextInt();
            int choice;
            /** лучше всего каждый кейс сделать отдельный методом . если не делать - чойс не нужно создавать заново каждый раз**/
            switch(numberSearch)
            {
                case 1:
                    System.out.println("Choice: 1 - add element    2 - show all books");
                    choice = scanner.nextInt();
                    if(choice == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=bookLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addBook(arrIndex);
                    }
                    if (choice == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutBooks();
                        System.out.println("==================================");
                    }
                    else System.out.println("You Choice is incorrect");
                    break;
                case 2:
                    System.out.println("Choice: 1 - add element    2 - show all clothes");
                    choice = scanner.nextInt();
                    if(choice == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=clothesLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addClothes(arrIndex);
                    }
                    if (choice == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutClothes();
                        System.out.println("==================================");
                    }
                    else System.out.println("You choes is incorrect");
                    break;
                case 3:
                    System.out.println("Choice: 1 - add element    2 - show all drinks");
                    choice = scanner.nextInt();
                    if(choice == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=drinkLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addDrink(arrIndex);
                    }
                    if (choice == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutDrinks();
                        System.out.println("==================================");
                    }
                    else System.out.println("You choes is incorrect");
                    break;
                case 4:
                    System.out.println("Choice: 1 - add element    2 - show all foods");
                    choice = scanner.nextInt();
                    if(choice == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=foodLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addFood(arrIndex);
                    }
                    if (choice == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutFoods();
                        System.out.println("==================================");
                    }
                    else System.out.println("You choes is incorrect");
                    break;
                case 5:
                    System.out.println("Choice: 1 - add element    2 - show all shoes");
                    choice = scanner.nextInt();
                    if(choice == 1){
                        System.out.println("Input index:");
                        int arrIndex = scanner.nextInt();
                        if(arrIndex>=shoesLength){
                            System.out.println("You write incorrect index");
                            break;
                        }
                        closet.addShoes(arrIndex);
                    }
                    if (choice == 2){
                        System.out.println("==================================");
                        closet.printInfoAboutShoes();
                        System.out.println("==================================");
                    }
                    else System.out.println("You Choice is incorrect");
                    break;
                case 6:
                    closet.printInfoAboutCloset();
                    break;
                case 7:
                    /*FileWork of = new FileWork();
                    of.writeAllInfoToFile(closet);*/
                    break;
                case 8:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please , enter an int from 0 to 8");
                    break;

            }
        } while(numberSearch!=8);
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
        //System.out.println("7- Write info to the file");
        System.out.println("8- exit");
        System.out.println(" ");
        System.out.println(" ");
    }
}
