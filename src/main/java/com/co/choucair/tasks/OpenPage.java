package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {
    private String url;

    public OpenPage(String url) {
        this.url = url;
    }

    @Override
    public <T extends Actor> void performAs(T user) {
        user.attemptsTo(
                Open.url(url)
        );

    }
    public static OpenPage theApp(String url) {
        return Tasks.instrumented(OpenPage.class, url);
    }
}
