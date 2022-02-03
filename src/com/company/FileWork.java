package com.company;
import java.io.*;
import java.util.Arrays;

public class FileWork {
    public void writeAllInfoToFile(Closet closet) throws IOException {

        File file = new File("Data.txt");
        file.createNewFile();

        FileWriter writer = new FileWriter(file);
        writer.write("Books: " + Arrays.toString(closet.getBooksInCloset()) + "\n");
        writer.write("Clothes: " + Arrays.toString(closet.getClothesInCloset()) + "\n");
        writer.write("Drinks: " + Arrays.toString(closet.getDrinkablesInCloset()) + "\n");
        writer.write("Foods: " + Arrays.toString(closet.getFoodInCloset()) + "\n");
        writer.write("Shoes: " + Arrays.toString(closet.getShoesInCloset()) + "\n");
        writer.flush();
        writer.close();

        // Создание объекта FileReader
        /*FileReader fr = new FileReader(file);
        char [] a = new char[200];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив

        for(char c : a)
            System.out.print(c);   // Вывод символов один за другими
        fr.close();
    }*/
    }


}
