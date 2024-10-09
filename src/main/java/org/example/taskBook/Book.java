package org.example.taskBook;

public class Book implements Displayable{
    private String nameOfBook;
    private String author;
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setName(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    @Override
    public void display(){
        System.out.println("Name: " + this.nameOfBook);
        System.out.println("Author: " + this.author);
        System.out.println("Year of publication: " + this.yearOfPublication);
    }
}
