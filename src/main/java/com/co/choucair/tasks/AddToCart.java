package com.co.choucair.tasks;

import static com.co.choucair.userinterfaces.Inventory.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AddToCart implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_ITEM_1),
                Click.on(BUTTON_ITEM_2),
                Click.on(BUTTON_ITEM_3),
                Click.on(BUTTON_ITEM_4),
                Click.on(BUTTON_ITEM_5),
                Click.on(BUTTON_ITEM_6),
                Click.on(CART)
        );

    }

  public static AddToCart theProducts(){
        return Tasks.instrumented(AddToCart.class);
  }
}
