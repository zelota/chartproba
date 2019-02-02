package com.home.chartcomponent;

import java.io.Serializable;

import com.vaadin.shared.ui.JavaScriptComponentState;

public class ChartComponentState extends JavaScriptComponentState implements Serializable {
    private static final long serialVersionUID = 201902021510235235L;

    public String[] data;
}
