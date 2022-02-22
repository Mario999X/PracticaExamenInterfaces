package com.example.practicaexamen;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AppGrafLineasController implements Initializable {

    @FXML
    private StackPane appGrafLineas;

    @FXML
    private LineChart<String, Double> grafLineas;

    @FXML
    private void volverPrincipalGB(){
        appGrafLineas.setVisible(false);
    }

    public void iniciarGrafica(){
        grafLineas.setTitle("Natalidad Especies");
        XYChart.Series serieMamifero = new XYChart.Series();
        serieMamifero.setName("Mamifero");
        serieMamifero.getData().add(new XYChart.Data("2015", 0.9));



        serieMamifero.getData().add(new XYChart.Data("2016", 0.9));
        serieMamifero.getData().add(new XYChart.Data("2017", 0.9));
        serieMamifero.getData().add(new XYChart.Data("2018", 0.9));
        serieMamifero.getData().add(new XYChart.Data("2019", 0.9));
        serieMamifero.getData().add(new XYChart.Data("2020", 1));


        XYChart.Series seriePez = new XYChart.Series();
        seriePez.setName("Pez");
        seriePez.getData().add(new XYChart.Data("2015", 1));
        seriePez.getData().add(new XYChart.Data("2016", 1));
        seriePez.getData().add(new XYChart.Data("2017", 1));
        seriePez.getData().add(new XYChart.Data("2018", 1));
        seriePez.getData().add(new XYChart.Data("2019", 1));
        seriePez.getData().add(new XYChart.Data("2020", 0.9));
        XYChart.Series serieAve = new XYChart.Series();
        serieAve.setName("Ave");
        serieAve.getData().add(new XYChart.Data("2015", 0.6));
        serieAve.getData().add(new XYChart.Data("2016", 0.6));
        serieAve.getData().add(new XYChart.Data("2017", 0.6));
        serieAve.getData().add(new XYChart.Data("2018", 0.7));
        serieAve.getData().add(new XYChart.Data("2019", 0.8));
        serieAve.getData().add(new XYChart.Data("2020", 0.8));
        XYChart.Series serieReptil = new XYChart.Series();
        serieReptil.setName("Reptil");
        serieReptil.getData().add(new XYChart.Data("2015", 0.3));
        serieReptil.getData().add(new XYChart.Data("2016", 0.5));
        serieReptil.getData().add(new XYChart.Data("2017", 0.4));
        serieReptil.getData().add(new XYChart.Data("2018", 0.7));
        serieReptil.getData().add(new XYChart.Data("2019", 0.6));
        serieReptil.getData().add(new XYChart.Data("2020", 0.9));
        grafLineas.getData().addAll(serieMamifero, seriePez, serieAve, serieReptil);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        iniciarGrafica();
    }
}
