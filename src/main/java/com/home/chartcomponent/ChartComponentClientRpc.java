package com.home.chartcomponent;

import com.vaadin.shared.communication.ClientRpc;

/**
 * Adatok küldése akliens oldalra.
 * Az adatok JSON stringként mennek át.
 *
 * @author Varsányi Péter
 */
public interface ChartComponentClientRpc extends ClientRpc {
    /**
     * Teljes konfiguráció cseréje.
     *
     * @param configData A konfig adatok JSON stringként.
     */
    void changeConfig( String configData );

    /**
     * Csak az adatok frissítése.
     *
     * @param newData Az adatok tömbje JSON stringként.
     */
    void changeData( String newData );
}
