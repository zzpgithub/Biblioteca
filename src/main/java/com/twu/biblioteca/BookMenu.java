package com.twu.biblioteca;


import java.util.Arrays;
import java.util.List;

public class BookMenu {
  private List<Book> bookList;

  public BookMenu() {
    this.bookList = Arrays.asList(
        new Book("The Old Man and the Sea", "Hemingway", "1952"),
        new Book("Jean Christophe", "Romain Rolland", "1912"),
        new Book("Blowing in The Wind", "Bob Dylan", "1960"),
        new Book("Saint Joan", "George Bernard Shaw", "1923")
    );
  }

  public void displayBookDetails(){
    for (Book book:bookList) {
      System.out.print(book + "\n");
    }
  }
}

