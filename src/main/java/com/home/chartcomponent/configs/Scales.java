package com.home.chartcomponent.configs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Scales implements Serializable {

    private static final long serialVersionUID = 2019020516214124L;

    private List<YAxes> yAxes;

    public Scales() {
        yAxes = new ArrayList<>();
    }
}
