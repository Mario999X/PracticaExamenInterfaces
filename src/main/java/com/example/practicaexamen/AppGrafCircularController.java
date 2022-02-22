package com.example.practicaexamen;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;

public class AppGrafCircularController {

    @FXML
    private StackPane appGrafCircular;

    @FXML
    private PieChart grafCircular;

    @FXML
    private void volverPrincipalGrafC() {
        appGrafCircular.setVisible(false);
    }

    public void cargarDatosPieChart(ObservableList<Animal> listaDatos) {
        int contadorVertebrados = 0;
        for (Animal a1 : listaDatos) {
            if (a1.getClasificacion().equals("Vertebrado")) {
                contadorVertebrados++;
            }
        }

        int contadorInvertebrados = 0;
        for (Animal a2 : listaDatos) {
            if (a2.getClasificacion().equals("Invertebrado")) {
                contadorInvertebrados++;
            }
        }


        int contadorTotal = listaDatos.size() - contadorVertebrados - contadorInvertebrados;

        ObservableList<PieChart.Data> datosGrafica = FXCollections.observableArrayList(
                new PieChart.Data("Vertebrados", contadorVertebrados),
                new PieChart.Data("Invertebrados", contadorInvertebrados),
                new PieChart.Data("Otros", contadorTotal));
        grafCircular.setData(datosGrafica);
        grafCircular.setClockwise(false);
    }
}
