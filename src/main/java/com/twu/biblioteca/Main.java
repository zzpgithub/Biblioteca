package com.twu.biblioteca;

public class Main {

  public static void main(String[] args) {
    // System.out.println("Hello World!");
    Menu menu = new Menu();
    menu.printWelcomeMessage();
    //menu.printMenuOption();
    menu.selectMenu();

   // BookMenu bookMenu = new BookMenu();
   // bookMenu.displayBookDetails();
  }
}
