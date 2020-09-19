package co.com.banistmo.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.banistmo.ui.GooglePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WritingBar implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Youtube").into(SEARCH_BAR),
                Click.on(SEARCH_GOOGLE),
                Click.on(BUTTON_YOUTUBE)

        );

    }

    public static WritingBar SearchBar(){return instrumented(WritingBar.class);}
}
