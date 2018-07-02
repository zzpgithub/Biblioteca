package com.twu.biblioteca;

public class Main {

  public static void main(String[] args) {
    // System.out.println("Hello World!");
    Menu menu = new Menu();
    menu.printWelcomeMessage();
    //menu.printMenuOption();
    while (true) {
      menu.selectMenu();
    }

    // BookMenu bookMenu = new BookMenu();
    // bookMenu.displayBookDetails();
  }
}
