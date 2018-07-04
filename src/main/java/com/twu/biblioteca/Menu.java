package com.twu.biblioteca;

import com.twu.biblioteca.modelMenu.BookMenu;
import com.twu.biblioteca.modelMenu.MovieMenu;
import com.twu.biblioteca.modelMenu.UserMenu;
import java.util.Scanner;

public class Menu {

  public static final String LIST_BOOKS = "1";
  public static final String CHECKOUT_BOOK = "2";
  public static final String RETURN_BOOK = "3";
  public static final String LIST_MOVIES = "4";
  public static final String CHECKOUT_MOVIE = "5";
  public static final String RETURN_MOVIE = "6";
  public static final String USER_ACCOUNTS = "7";
  public static final String QUIT = "8";

  private BookMenu bookMenu;
  private UserMenu userMenu;
  private MovieMenu movieMenu;

  public Menu() {
    bookMenu = new BookMenu();
    userMenu = new UserMenu();
    movieMenu = new MovieMenu();
  }

  public void printWelcomeMessage() {
    System.out.println("Welcome to the Biblioteca!");
  }

  public void printMenuOption() {
    System.out.println("1.List Books\n" + "2.Checkout Book\n" + "3.Return Book\n"
        + "4.List Movies\n"
        + "5.Checkout Movie\n"
        + "6.Return Movie\n"
        + "7.User Accounts\n"
        + "8.Quit\n"
        + "Please input your choice:");
  }

  public void selectMenu() {
    printMenuOption();
    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();
    switch (choice) {
      case LIST_BOOKS:
        bookMenu.displayBookDetails();
        break;
      case CHECKOUT_BOOK:
        System.out.println("Input book name want to check out:");
        Scanner bookNameCheckOut = new Scanner(System.in);
        bookMenu.checkOutBook(bookNameCheckOut.nextLine());
        break;
      case RETURN_BOOK:
        System.out.println("Input book name want to return:");
        Scanner bookNameReturn = new Scanner(System.in);
        bookMenu.returnBook(bookNameReturn.nextLine());
        break;
      case LIST_MOVIES:
        movieMenu.displayMovie();
        break;
      case CHECKOUT_MOVIE:
        System.out.println("Input movie want to check out:");
        Scanner movieNameCheckOut = new Scanner(System.in);
        movieMenu.checkOutMovie(movieNameCheckOut.nextLine());
        break;
      case RETURN_MOVIE:
        System.out.println("Input movie name want to return:");
        Scanner movieNameReturn = new Scanner(System.in);
        movieMenu.returnMovie(movieNameReturn.nextLine());
        break;
      case USER_ACCOUNTS:
        System.out.println("Please logIn:");
        userMenu.login();
        break;
      case QUIT:
        System.exit(0);
      default:
        System.out.println("Select a valid option!\n");
        break;
    }
  }
}

