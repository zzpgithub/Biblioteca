package com.twu.biblioteca.modelMenu;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;

public class UserMenuTest {

  private UserMenu userMenu;
  private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

  @Before
  public void setup() {
    userMenu = new UserMenu();
    System.setOut(new PrintStream(outContent));
  }

  private String systemOut() {
    return outContent.toString();
  }

  @Test
  public void should_return_true_when_login_successful() {
    assertThat( userMenu.checkLogIn("111-1111","1111111")).isTrue();
  }

  @Test
  public void should_return_false_when_login_unsuccessful() {
    assertThat( userMenu.checkLogIn("222-1111","2221111")).isFalse();
  }

}