package com.co.choucair.tasks;

import static com.co.choucair.userinterfaces.Checkout.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


public class CompletePurchases implements Task {

    private String firstName;
    private String lastName;
    private String zip;

    public CompletePurchases(String firstName, String lastName, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zip = zip;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT),
                Enter.theValue(firstName).into(INPUT_FIRST_NAME),
                Enter.theValue(lastName).into(INPUT_LAST_NAME),
                Enter.theValue(zip).into(INPUT_POSTAL_CODE),
                Click.on(BTN_CONTINUE)
        );
    }

    public static CompletePurchases finishForm(String firstName, String lastName, String zip) {
        return Tasks.instrumented(CompletePurchases.class, firstName, lastName, zip);
    }


}
