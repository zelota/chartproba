package com.home.chartcomponent.configs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@lombok.Data
public class Data implements Serializable {

    private static final long serialVersionUID = 201902051608235235L;

    private List<String> labels;

    private List<Datasets> datasets;

    public Data() {
        labels = new ArrayList<>();
        datasets = new ArrayList<>();
    }
}
