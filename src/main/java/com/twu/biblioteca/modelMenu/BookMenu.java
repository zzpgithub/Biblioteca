package com.twu.biblioteca.modelMenu;


import com.twu.biblioteca.model.Book;
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

  public void displayBookDetails() {
    for (Book book : bookList) {
      if (!book.isCheckOut()) {
        System.out.print(book + "\n");
      }
    }
  }

  public void checkOutBook(String bookName) {
    while (true) {
      //System.out.println("Input book name want to check out:");
      if (isBookCheckedOut(bookName, false)) {
        System.out.println("Thank you! Enjoy the book");
        break;
      } else {
        System.out.print("That book is not available.\n");
        break;
      }
    }
  }

  public void returnBook(String bookName) {
    //System.out.println("Please input a book name you want to return:");
    if(isBookCheckedOut(bookName, true)){
      System.out.print("Thank you for returning the book.\n");
    }
    else
      System.out.print("That is not a valid book to return.\n");
  }


  public boolean isBookCheckedOut(String bookName, boolean isCheckOut) {
    Book checkOutBook = new Book(bookName, "", "");
    boolean flag = false;
    for (Book book : bookList) {
      if (checkOutBook.equals(book) && book.isCheckOut() == isCheckOut) {
        book.setCheckOut(!isCheckOut);
        //bookList.remove(book);
        flag = true;
        break;
      } else {
        flag = false;
      }
    }
    return flag;
  }
}

