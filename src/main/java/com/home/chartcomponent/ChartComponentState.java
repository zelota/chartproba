package com.home.chartcomponent;

import java.io.Serializable;

import com.vaadin.shared.ui.JavaScriptComponentState;

/**
 * A komponens állapota, üzenetei.
 *
 * @author Varsányi Péter
 */
public class ChartComponentState extends JavaScriptComponentState implements Serializable {
    private static final long serialVersionUID = 201902021510235235L;

    public static final String TARGET_CONFIG = "CONFIG";

    public static final String TARGET_DATA = "DATA";

    // mi változik, mi a data tartalma? CONFIG vagy DATA
    public String target;

    // az adatok JSON stringként
    public String data;
}
