package com.home;

import com.home.chartcomponent.ChartComponent;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class ChartView extends VerticalLayout implements View {

    private ChartComponent chartComponent;

    public ChartView() {

        HorizontalLayout buttonLayout = new HorizontalLayout();
        Button btnPrev = new Button(" << ");
        Button btnNext = new Button(" >> ");
        Button btnBack = new Button(" Back ");
        buttonLayout.addComponents(btnBack, btnPrev, btnNext);

        btnBack.addClickListener(c -> UI.getCurrent().getNavigator().navigateTo(""));
        btnPrev.addClickListener(this::clickPrev);
        btnNext.addClickListener(this::clickNext);

        chartComponent = new ChartComponent();

        addComponents(buttonLayout, chartComponent);
    }

    private void clickNext( Button.ClickEvent clickEvent ) {
        chartComponent.changeData(new String[]{"5", "6"});
    }

    private void clickPrev( Button.ClickEvent clickEvent ) {
        chartComponent.changeData(new String[]{"7", "8"});
    }

    @Override
    public void enter( ViewChangeListener.ViewChangeEvent event ) {
        chartComponent.changeData(new String[]{"1", "2"});
    }
}
