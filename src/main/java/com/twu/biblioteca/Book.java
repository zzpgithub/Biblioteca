package com.twu.biblioteca;

public class Book {
  private String name;
  private String author;
  private String yearPublished;

  public Book(String name, String author, String yearPublished) {
    this.name = name;
    this.author = author;
    this.yearPublished = yearPublished;
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

  @Override
  public String toString() {
    return "Book{" +
        "name='" + name + '\'' +
        ", author='" + author + '\'' +
        ", yearPublished='" + yearPublished + '\'' +
        '}';
  }
}

