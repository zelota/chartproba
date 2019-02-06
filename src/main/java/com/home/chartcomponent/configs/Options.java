package com.home.chartcomponent.configs;

import java.io.Serializable;

import lombok.Data;

@Data
public class Options implements Serializable {

    private static final long serialVersionUID = 201902051619345L;

    private Scales scales;

    public Options() {
        scales = new Scales();
    }
}
