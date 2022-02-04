package com.company.Util;

import com.company.Books;

import java.util.StringTokenizer;

public class BookDeserializer {

    public static Books getBookFromString(String book){
        book = book.trim();
        book=book.substring("Books".length());
        Books books = new Books();
        book = book.replace("{","");
        book = book.replace("}","");
        book = book.replace(" ","");
        book = book.replace("'","");

        StringTokenizer stringTokenizer = new StringTokenizer(book,",= ");

        stringTokenizer.nextToken();
        books.setTypeOfBook(stringTokenizer.nextToken());
        stringTokenizer.nextToken();
        books.setValueOfPages(Integer.parseInt(stringTokenizer.nextToken()));
        stringTokenizer.nextToken();
        books.setName(stringTokenizer.nextToken());
        stringTokenizer.nextToken();
        books.setCost(Integer.parseInt(stringTokenizer.nextToken()));
        stringTokenizer.nextToken();
        books.setSize(Integer.parseInt(stringTokenizer.nextToken()));
        return books;
    }
}
