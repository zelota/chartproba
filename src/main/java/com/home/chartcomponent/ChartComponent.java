package com.home.chartcomponent;

import java.io.Serializable;

import com.vaadin.annotations.JavaScript;
import com.vaadin.ui.AbstractJavaScriptComponent;

/**
 * ChartJS Bar komponens.
 *
 * @author Varsányi Péter
 */
@JavaScript({"vaadin://js/ChartComponent.js", "vaadin://js/ChartComponentConnector.js"})
public class ChartComponent extends AbstractJavaScriptComponent implements Serializable, ChartComponentServerRpc, ChartComponentClientRpc {
    private static final long serialVersionUID = 2019020215072341L;

    public ChartComponent() {
        setId("ChartComponentVer1");
    }

    @Override
    protected ChartComponentState getState() {
        return (ChartComponentState) super.getState();
    }

    @Override
    public void changeConfig( String configData ) {
        getState().target = ChartComponentState.TARGET_CONFIG;
        getState().data = configData;
    }

    @Override
    public void changeData( String newData ) {
        getState().target = ChartComponentState.TARGET_DATA;
        getState().data = newData;
    }
}
