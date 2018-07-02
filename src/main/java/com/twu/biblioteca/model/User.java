package com.twu.biblioteca.model;

import java.util.Objects;

public class User {
  private String libraryNumber;
  private String password;
  private String name;
  private String emailAddress;
  private String phoneNumber;

  public User(String libraryNumber, String password, String name, String emailAddress,
      String phoneNumber) {
    this.libraryNumber = libraryNumber;
    this.password = password;
    this.name = name;
    this.emailAddress = emailAddress;
    this.phoneNumber = phoneNumber;
  }

  public String getLibraryNumber() {
    return libraryNumber;
  }

  public void setLibraryNumber(String libraryNumber) {
    this.libraryNumber = libraryNumber;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(libraryNumber, user.libraryNumber) &&
        Objects.equals(password, user.password);
  }

  @Override
  public String toString() {
    return "User{" +
        "libraryNumber='" + libraryNumber + '\'' +
        ", password='" + password + '\'' +
        ", name='" + name + '\'' +
        ", emailAddress='" + emailAddress + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        '}';
  }
}
