package com.example.practicaexamen;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;

public class AppDetalleController {

    @FXML
    private StackPane appDetalle;

    @FXML
    private Label lblNombre, lblEspecie;

    public void cargarAnimal(Animal animal){

        lblNombre.setText(animal.getNombre());
        lblEspecie.setText(animal.getEspecie());

    }

    @FXML
    private void volverADetalle(){
        appDetalle.setVisible(false);
    }


}
