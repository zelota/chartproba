package com.home.chartcomponent.configs;

import java.io.Serializable;

@lombok.Data
public class BarChartCfg implements Serializable {

    private static final long serialVersionUID = 2019020528345345L;

    private String type;

    private Data data;

    private Options options;

    public BarChartCfg() {
        type = "bar";
        data = new Data();
        options = new Options();
    }

}
