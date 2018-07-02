package com.twu.biblioteca.modelMenu;

import com.twu.biblioteca.model.User;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserMenu {

  private List<User> userList;
  //private String libraryNumber;

  public UserMenu(){
    this.userList = Arrays.asList(
        new User("111-1111", "1111111", "Marry", "111@tw.com", "1111111"),
        new User("222-2222", "2222222", "Jack", "222@tw.com", "2222222")
    );
  }

  public boolean checkLogIn(String libraryNumber, String password) {
    User userLogin = new User(libraryNumber,password,"","","");
    for(User user:userList){
      if(userLogin.equals(user)){
        System.out.println(user);
        return true;
      }
    }
    return false;
  }

  public boolean login(){
    while (true){
      System.out.print("Input library number(xxx-xxxx):\n");
      Scanner scanner = new Scanner(System.in);
      String libraryNumber = scanner.nextLine();

      System.out.print("input password:\n");
      Scanner scanner1 = new Scanner(System.in);
      String password = scanner1.nextLine();

      if(checkLogIn(libraryNumber,password)){
        System.out.print("Login Successful! Welcome.\n");
       // this.libraryNumber = libraryNumber;
        return true;
      }
      else{
        System.out.print("Login failed! Please try again.\n");
      }
    }
  }
}
