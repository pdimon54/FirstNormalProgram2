package com.company;

public class Test {
    public static void main(String[] args) {
        Books books = new Books("name",1,1);
        System.out.println(books);
        assert books.getName().equals("name");
        assert books.getCost()==1;
        assert books.getSize()==1;
    }
}
