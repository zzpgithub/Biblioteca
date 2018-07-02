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
    System.out.println("List Books " + "Please input your choice:\n");
  }

  public void selectMenu() {
    printMenuOption();
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    switch (choice) {
      case 1:
        bookMenu.displayBookDetails();
        break;
      default:
        System.out.println("Select a valid option!\n");
        break;
    }
  }
}

