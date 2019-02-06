package com.home;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.google.gson.Gson;
import com.home.chartcomponent.ChartComponent;
import com.home.chartcomponent.configs.BarChartCfg;
import com.home.chartcomponent.configs.Datasets;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Button;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import lombok.extern.java.Log;

@Log
public class BarChartView extends VerticalLayout implements View {

    private ChartComponent chartComponent;

    public BarChartView() {

        HorizontalLayout buttonLayout = new HorizontalLayout();
        Button btnPrev = new Button(" << ");
        Button btnNext = new Button(" >> ");
        Button btnBack = new Button(" Back ");
        buttonLayout.addComponents(btnBack, btnPrev, btnNext);

        btnBack.addClickListener(c -> UI.getCurrent().getNavigator().navigateTo(""));
        btnPrev.addClickListener(this::clickPrev);
        btnNext.addClickListener(this::clickNext);

        chartComponent = new ChartComponent();

        addComponents(buttonLayout, chartComponent);
    }

    private void clickNext( Button.ClickEvent clickEvent ) {
        sendRandomData();
    }

    private void sendRandomData() {
        List<Integer> data = new ArrayList<>();
        data.add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        data.add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        data.add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        data.add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        data.add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        data.add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        Gson mapper = new Gson();
        String dataJsonStr = mapper.toJson(data);
        chartComponent.changeData(dataJsonStr);
    }

    private void clickPrev( Button.ClickEvent clickEvent ) {
        sendRandomData();
    }

    private void changeConfigExample() {
        BarChartCfg cfg = getInitConfig();
        Gson mapper = new Gson();
        String cfgJsonStr = mapper.toJson(cfg);
        chartComponent.changeConfig(cfgJsonStr);
    }

    @Override
    public void enter( ViewChangeListener.ViewChangeEvent event ) {
//        BarChartCfg cfg = getInitConfig();
//        Gson mapper = new Gson();
//        String cfgJsonStr = mapper.toJson(cfg);
//        chartComponent.changeConfig(cfgJsonStr);
    }

    //    var myChart = new Chart(ctx, {
//            type: 'bar',
//    data: {
//        labels: ["Red", "Blue", "Yellow", "Green", "Purple", "Orange"],
//        datasets: [{
//            label: '# of Votes',
//                    data: [12, 19, 3, 5, 2, 3],
//            backgroundColor: [
//            'rgba(255, 99, 132, 0.2)',
//                    'rgba(54, 162, 235, 0.2)',
//                    'rgba(255, 206, 86, 0.2)',
//                    'rgba(75, 192, 192, 0.2)',
//                    'rgba(153, 102, 255, 0.2)',
//                    'rgba(255, 159, 64, 0.2)'
//            ],
//            borderColor: [
//            'rgba(255,99,132,1)',
//                    'rgba(54, 162, 235, 1)',
//                    'rgba(255, 206, 86, 1)',
//                    'rgba(75, 192, 192, 1)',
//                    'rgba(153, 102, 255, 1)',
//                    'rgba(255, 159, 64, 1)'
//            ],
//            borderWidth: 1
//        }]
//    },
//    options: {
//        scales: {
//            yAxes: [{
//                ticks: {
//                    beginAtZero:true
//                }
//            }]
//        }
//    }
//});
    private BarChartCfg getInitConfig() {
        BarChartCfg cfg = new BarChartCfg();

        cfg.getData().getLabels().add("Red");
        cfg.getData().getLabels().add("Blue");
        cfg.getData().getLabels().add("Yellow");
        cfg.getData().getLabels().add("Green");
        cfg.getData().getLabels().add("Purple");
        cfg.getData().getLabels().add("Orange");

        Datasets ds = new Datasets();
        ds.setLabel("# of Votes");

        ds.getData().add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        ds.getData().add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        ds.getData().add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        ds.getData().add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        ds.getData().add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));
        ds.getData().add(new Integer(ThreadLocalRandom.current().nextInt(1, 20 + 1)));

        ds.getBackgroundColor().add("rgba(255, 99, 132, 0.2)");
        ds.getBackgroundColor().add("rgba(54, 162, 235, 0.2)");
        ds.getBackgroundColor().add("rgba(255, 206, 86, 0.2)");
        ds.getBackgroundColor().add("rgba(75, 192, 192, 0.2)");
        ds.getBackgroundColor().add("rgba(153, 102, 255, 0.2)");
        ds.getBackgroundColor().add("rgba(255, 159, 64, 0.2)");

        ds.getBoderColor().add("rgba(255,99,132,1)");
        ds.getBoderColor().add("rgba(54, 162, 235, 1)");
        ds.getBoderColor().add("rgba(255, 206, 86, 1)");
        ds.getBoderColor().add("rgba(75, 192, 192, 1)");
        ds.getBoderColor().add("rgba(153, 102, 255, 1)");
        ds.getBoderColor().add("rgba(255, 159, 64, 1)");

        ds.setBorderWidth(new Integer(1));

        cfg.getData().getDatasets().add(ds);

        return cfg;
    }
}
