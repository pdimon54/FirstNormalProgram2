package com.company;

import com.company.Util.BookDeserializer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("file.txt");
        Scanner scanner = new Scanner(fileReader);
        String book = scanner.nextLine();
        Books books = BookDeserializer.getBookFromString(book);
        System.out.println(books);
    }
}
