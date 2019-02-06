package com.home.chartcomponent.configs;

import java.io.Serializable;

import lombok.Data;

@Data
public class Ticks implements Serializable {

    private static final long serialVersionUID = 20190205162563673L;

    private Boolean beginAtZero;

    public Ticks() {
        beginAtZero = true;
    }
}
