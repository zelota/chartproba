package com.home;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class StartView extends VerticalLayout implements View {

    public StartView() {
        final TextField name = new TextField();
        name.setCaption("Type your name here:");

        Button button = new Button("Click Me");
        button.addClickListener(e -> {
            addComponent(new Label("Thanks " + name.getValue()
                    + ", it works!"));
        });

        Button buttonGo = new Button("Jump to view");
        buttonGo.addClickListener(e -> {
            UI.getCurrent().getNavigator().navigateTo("CHARTPROBA");
        });

        addComponents(buttonGo, name, button);
    }

}
