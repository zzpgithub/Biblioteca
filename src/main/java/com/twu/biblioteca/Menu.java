package com.twu.biblioteca;

import com.twu.biblioteca.modelMenu.BookMenu;
import com.twu.biblioteca.modelMenu.UserMenu;
import java.util.Scanner;

public class Menu {

  private BookMenu bookMenu;
  private UserMenu userMenu;

  public Menu() {
    bookMenu = new BookMenu();
    userMenu = new UserMenu();
  }

  public void printWelcomeMessage() {
    System.out.println("Welcome to the Biblioteca!");
  }

  public void printMenuOption() {
    System.out.println("1.List Books\n" + "2.Checkout Book\n" + "3.Return Book\n" + "4.Quit\n"
        + "5.User Accounts\n"
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
        System.exit(0);
      case 5:
        System.out.println("Please logIn:");
        userMenu.login();
        break;
      default:
        System.out.println("Select a valid option!\n");
        break;
    }
  }
}

