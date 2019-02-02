package com.home.chartcomponent;

import com.vaadin.shared.communication.ClientRpc;

public interface ChartComponentClientRpc extends ClientRpc {
    public void changeData( String[] data );
}
