package com.twu.biblioteca.model;

import java.util.Objects;

public class Book {
  private String name;
  private String author;
  private String yearPublished;
  private boolean isCheckOut;

  public Book(String name, String author, String yearPublished) {
    this.name = name;
    this.author = author;
    this.yearPublished = yearPublished;
    this.isCheckOut = false;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getYearPublished() {
    return yearPublished;
  }

  public void setYearPublished(String yearPublished) {
    this.yearPublished = yearPublished;
  }

  public boolean isCheckOut() {
    return isCheckOut;
  }

  public void setCheckOut(boolean checkOut) {
    isCheckOut = checkOut;
  }

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", author='" + author + '\'' +
        ", yearPublished='" + yearPublished + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(name, book.name);
  }
}

