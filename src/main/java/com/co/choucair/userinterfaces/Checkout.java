package com.co.choucair.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.TreeMap;

public class Checkout {

    public static final Target BTN_CHECKOUT = Target.the("Boton checkout")
            .located(By.xpath("//*[@id=\"checkout\"]"));
    public static final Target INPUT_FIRST_NAME = Target.the("Firs Name")
            .located(By.id("first-name"));
    public static final Target INPUT_LAST_NAME = Target.the("Last Name")
            .located(By.id("last-name"));
    public static final Target INPUT_POSTAL_CODE = Target.the("Codigo postal")
            .located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("Boton continuar")
            .located(By.id("continue"));

}
