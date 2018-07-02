package com.twu.biblioteca;

import com.twu.biblioteca.model.Movie;
import com.twu.biblioteca.modelMenu.BookMenu;
import com.twu.biblioteca.modelMenu.MovieMenu;
import com.twu.biblioteca.modelMenu.UserMenu;
import java.util.Scanner;

public class Menu {

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
    int choice = scanner.nextInt();
    switch (choice) {
      case 1:
        bookMenu.displayBookDetails();
        break;
      case 2:
        System.out.println("Input book name want to check out:");
        Scanner bookNameCheckOut = new Scanner(System.in);
        bookMenu.checkOutBook(bookNameCheckOut.nextLine());
        break;
      case 3:
        System.out.println("Input book name want to return:");
        Scanner bookNameReturn = new Scanner(System.in);
        bookMenu.returnBook(bookNameReturn.nextLine());
        break;
      case 4:
        movieMenu.displayMovie();
        break;
      case 5:
        System.out.println("Input movie want to check out:");
        Scanner movieNameCheckOut = new Scanner(System.in);
        movieMenu.checkOutMovie(movieNameCheckOut.nextLine());
        break;
      case 6:
        System.out.println("Input movie name want to return:");
        Scanner movieNameReturn = new Scanner(System.in);
        movieMenu.returnMovie(movieNameReturn.nextLine());
        break;
      case 7:
        System.out.println("Please logIn:");
        userMenu.login();
        break;
      case 8:
        System.exit(0);
      default:
        System.out.println("Select a valid option!\n");
        break;
    }
  }
}

