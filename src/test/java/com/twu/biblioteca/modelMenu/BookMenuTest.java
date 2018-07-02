package com.twu.biblioteca.modelMenu;

import com.twu.biblioteca.model.Book;
import com.twu.biblioteca.modelMenu.BookMenu;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class BookMenuTest {

  private BookMenu bookMenu;
  private ByteArrayOutputStream outContent = new ByteArrayOutputStream();


  @Before
  public void setup() {
    bookMenu = new BookMenu();
    System.setOut(new PrintStream(outContent));
  }

  private String systemOut() {
    return outContent.toString();
  }

  @Test
  public void should_return_book_details() {
    bookMenu.displayBookDetails();

    assertThat(systemOut()).isEqualTo(
        "Book{name=\'The Old Man and the Sea\', author=\'Hemingway\', yearPublished=\'1952\'}\n"
            + "Book{name=\'Jean Christophe\', author=\'Romain Rolland\', yearPublished=\'1912\'}\n"
            + "Book{name=\'Blowing in The Wind\', author=\'Bob Dylan\', yearPublished=\'1960\'}\n"
            + "Book{name=\'Saint Joan\', author=\'George Bernard Shaw\', yearPublished=\'1923\'}\n");
  }

  @Test
  public void should_return_successful_message_when_checked_out_book_success() {
    Book book = new Book("Saint Joan", "George Bernard Shaw", "1923");
    bookMenu.checkOutBook(book.getName());
    assertThat(systemOut().contains("Thank you! Enjoy the book")).isTrue();
  }

  @Test
  public void should_return_unsuccessful_message_when_checked_out_book_unsuccess() {
    Book book = new Book("Head", "Brad Kale", "1980");
    bookMenu.checkOutBook(book.getName());
    assertThat(systemOut().contains("That book is not available")).isTrue();
  }

  @Test
  public void should_return_successful_message_when_return_book_success() {
    Book book = new Book("Saint Joan", "George Bernard Shaw", "1923");
    bookMenu.checkOutBook(book.getName());
    bookMenu.returnBook(book.getName());
    assertThat(systemOut().endsWith("Thank you for returning the book.\n")).isTrue();
  }

  @Test
  public void should_return_unsuccessful_message_when_return_book_unsuccess() {
    Book book = new Book("Saint Joan", "George Bernard Shaw", "1923");
    bookMenu.checkOutBook(book.getName());
    bookMenu.returnBook("Head");
    assertThat(systemOut().endsWith("That is not a valid book to return.\n")).isTrue();
  }

}