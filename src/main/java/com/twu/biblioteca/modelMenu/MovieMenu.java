package com.twu.biblioteca.modelMenu;

import com.twu.biblioteca.model.Movie;
import java.util.Arrays;
import java.util.List;

public class MovieMenu {
  private List<Movie> movieList;

  public MovieMenu() {
    this.movieList = Arrays.asList(
        new Movie("The Shawshank Redemption","1994","Frank Darabont","9.4"),
        new Movie("Forrest Gump","1993","Robert Zemeckis","9.4"),
        new Movie("Braveheart","1995","Mel Gibson","8.5")
    );
  }

  public void displayMovie() {
    for (Movie movie : movieList) {
      if (!movie.isCheckOut()) {
        System.out.print(movie + "\n");
      }
    }
  }

  public void checkOutMovie(String movieName) {
    while (true) {
      //System.out.println("Input book name want to check out:");
      if (isMovieCheckedOut(movieName, false)) {
        System.out.println("Thank you! Enjoy the movie");
        break;
      } else {
        System.out.print("That movie is not available.\n");
        break;
      }
    }
  }


  public void returnMovie(String movieName) {
    //System.out.println("Please input a book name you want to return:");
    if(isMovieCheckedOut(movieName, true)){
      System.out.print("Thank you for returning the movie.\n");
    }
    else
      System.out.print("That is not a valid movie to return.\n");
  }

  public boolean isMovieCheckedOut(String movieName, boolean isCheckOut) {
    Movie checkOutMovie = new Movie(movieName, "", "","");
    boolean flag = false;
    for (Movie movie : movieList) {
      if (checkOutMovie.equals(movie) && movie.isCheckOut() == isCheckOut) {
        movie.setCheckOut(!isCheckOut);
        //bookList.remove(book);
        flag = true;
        break;
      } else {
        flag = false;
      }
    }
    return flag;
  }
}
