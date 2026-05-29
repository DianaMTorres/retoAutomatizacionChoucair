package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SerenityLoginPage {
  public static final Target TXT_USER = Target.the("username")
          .located(By.id("user-name"));
  public static final Target TXT_PASS = Target.the("password")
          .located(By.id("password"));
  public static final Target BTN_LOGIN = Target.the("button login")
          .located(By.id("login-button"));


}