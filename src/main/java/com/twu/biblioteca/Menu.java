package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {

  private BookMenu bookMenu;

  public Menu() {
    bookMenu = new BookMenu();
  }

  public void printWelcomeMessage() {
    System.out.println("Welcome to the Biblioteca!");
  }

  public void printMenuOption() {
    System.out.println("1.List Books \n" + "2.Checkout Book\n" + "3.Return Book\n" + "4.Quit\n" + "Please input your choice:");
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
      default:
        System.out.println("Select a valid option!\n");
        break;
    }
  }
}

