package com.co.choucair.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Inventory {

    public static final Target BUTTON_ITEM_1 = Target.the("Backpack")
            .located(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]"));
    public static final Target BUTTON_ITEM_2 = Target.the("T-Shirt")
            .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    public static final Target BUTTON_ITEM_3 = Target.the("Onesie")
            .located(By.id("add-to-cart-sauce-labs-onesie"));
    public static final Target BUTTON_ITEM_4 = Target.the("Bike Light")
            .located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target BUTTON_ITEM_5 = Target.the("Fleece Jacket")
            .located(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    public static final Target BUTTON_ITEM_6 = Target.the("T-Shirt (Red)")
            .located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    public static final Target CART = Target.the("Carrito de compras")
            .located(By.xpath("//*[@id=\"shopping_cart_container\"]/a"));

}
