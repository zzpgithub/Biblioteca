package com.twu.biblioteca.model;

import java.util.Objects;

public class Movie {
  private String name;
  private String year;
  private String director;
  private String rating;
  private boolean isCheckOut;

  public Movie(String name, String year, String director, String rating) {
    this.name = name;
    this.year = year;
    this.director = director;
    this.rating = rating;
    this.isCheckOut = false;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getYear() {
    return year;
  }

  public void setYear(String year) {
    this.year = year;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public boolean isCheckOut() {
    return isCheckOut;
  }

  public void setCheckOut(boolean checkOut) {
    isCheckOut = checkOut;
  }

  @Override
  public String toString() {
    return "Movie{" +
        "name='" + name + '\'' +
        ", year='" + year + '\'' +
        ", director='" + director + '\'' +
        ", rating='" + rating + '\'' +
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
    Movie movie = (Movie) o;
    return Objects.equals(name, movie.name);
  }

  @Override
  public int hashCode() {

    return Objects.hash(name);
  }
}
