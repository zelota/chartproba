package com.home.chartcomponent.configs;

import java.io.Serializable;

import lombok.Data;

@Data
public class YAxes implements Serializable {

    private static final long serialVersionUID = 201902051623325235L;

    private Ticks ticks;

    public YAxes() {
        ticks = new Ticks();
    }
}
