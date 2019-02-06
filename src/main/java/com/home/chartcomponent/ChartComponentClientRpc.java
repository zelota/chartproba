package com.home.chartcomponent;

import com.vaadin.shared.communication.ClientRpc;

public interface ChartComponentClientRpc extends ClientRpc {
    void changeConfig( String configData );

    void changeData( String newData );
}
