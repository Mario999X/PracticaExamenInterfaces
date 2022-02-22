package com.example.practicaexamen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

public class AppDetalleController {

    @FXML
    private StackPane appDetalle;

    @FXML
    private Label lblNombre, lblClasificacion;

    public void cargarAnimalEnDetalle(Animal animal) {
        lblNombre.setText(animal.getNombre());
        lblClasificacion.setText(animal.getClasificacion());
    }

    @FXML
    private void volverADetalle() {
        appDetalle.setVisible(false);
    }

}
