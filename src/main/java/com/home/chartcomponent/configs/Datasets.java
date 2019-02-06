package com.home.chartcomponent.configs;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@lombok.Data
public class Datasets implements Serializable {
    private static final long serialVersionUID = 201902051612523L;

    private String label;

    private List<Integer> data;

    private List<String> backgroundColor;

    private List<String> boderColor;

    private Integer borderWidth;

    public Datasets() {
        data = new ArrayList<>();
        backgroundColor = new ArrayList<>();
        boderColor = new ArrayList<>();
    }
}
