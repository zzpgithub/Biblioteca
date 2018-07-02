package com.twu.biblioteca.modelMenu;

import static org.fest.assertions.api.Assertions.assertThat;

import com.twu.biblioteca.model.Movie;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

public class MovieMenuTest {

  private MovieMenu movieMenu;
  private ByteArrayOutputStream outContent = new ByteArrayOutputStream();


  @Before
  public void setup() {
    movieMenu = new MovieMenu();
    System.setOut(new PrintStream(outContent));
  }

  private String systemOut() {
    return outContent.toString();
  }

  @Test
  public void should_return_book_details() {
    movieMenu.displayMovie();

    assertThat(systemOut()).isEqualTo(
        "Movie{name=\'The Shawshank Redemption\', year=\'1994\', director=\'Frank Darabont\', rating=\'9.4\'}\n"
            + "Movie{name=\'Forrest Gump\', year=\'1993\', director=\'Robert Zemeckis\', rating=\'9.4\'}\n"
            + "Movie{name=\'Braveheart\', year=\'1995\', director=\'Mel Gibson\', rating=\'8.5\'}\n");
  }

  @Test
  public void should_return_successful_message_when_checked_out_movie_success() {
    Movie movie = new Movie("The Shawshank Redemption", "1994", "Frank Darabont","9.4");
    movieMenu.checkOutMovie(movie.getName());
    assertThat(systemOut().contains("Thank you! Enjoy the movie")).isTrue();
  }

  @Test
  public void should_return_unsuccessful_message_when_checked_out_movie_unsuccess() {
    Movie movie = new Movie("Zootopia", "2016", "Byron Howard","9.0");
    movieMenu.checkOutMovie(movie.getName());
    assertThat(systemOut().contains("That movie is not available")).isTrue();
  }

  @Test
  public void should_return_successful_message_when_return_book_success() {
    Movie movie = new Movie("The Shawshank Redemption", "1994", "Frank Darabont","9.4");
    movieMenu.checkOutMovie(movie.getName());
    movieMenu.returnMovie(movie.getName());
    assertThat(systemOut().endsWith("Thank you for returning the movie.\n")).isTrue();
  }

  @Test
  public void should_return_unsuccessful_message_when_return_book_unsuccess() {
    Movie movie = new Movie("The Shawshank Redemption", "1994", "Frank Darabont","9.4");
    movieMenu.checkOutMovie(movie.getName());
    movieMenu.returnMovie("Zootopia");
    assertThat(systemOut().endsWith("That is not a valid movie to return.\n")).isTrue();
  }

}