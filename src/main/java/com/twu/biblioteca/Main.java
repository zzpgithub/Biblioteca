package com.twu.biblioteca;

public class Main {

  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.printWelcomeMessage();
    while (true) {
      menu.selectMenu();
    }
  }
}
