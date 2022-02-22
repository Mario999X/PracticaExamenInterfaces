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
    private void volverPrincipalGrafC(){
        appGrafCircular.setVisible(false);
    }

    public void cargarDatosPieChart(ObservableList<Animal> listaDatos){
        int contadorMamiferos = 0;
        for (Animal a1 : listaDatos){
            if (a1.getEspecie().equals("Mamifero")){
                contadorMamiferos++;
            }
        }


        int contadorTotal = listaDatos.size() - contadorMamiferos;

        ObservableList<PieChart.Data> datosGrafica = FXCollections.observableArrayList(
                new PieChart.Data("Mamiferos", contadorMamiferos),
                new PieChart.Data("Otros", contadorTotal));
        grafCircular.setData(datosGrafica);
        grafCircular.setClockwise(false);
    }
}
