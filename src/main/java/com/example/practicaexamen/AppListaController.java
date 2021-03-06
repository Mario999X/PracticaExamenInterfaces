package com.example.practicaexamen;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.StackPane;

public class AppListaController{

    @FXML
    private StackPane appLista, appDetalle;

    @FXML
    private AppDetalleController appDetalleController;

    @FXML
    private ListView vistaLista;

    public void cargarVistaLista(ObservableList<Animal> listaDatos){
        appDetalle.setVisible(false);
        vistaLista.setItems(listaDatos);

        vistaLista.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        vistaLista.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue != null) {
                appDetalleController.cargarAnimalEnDetalle((Animal)newValue);
                cargarVistaDetalle();
            }
        });

    }

    @FXML
    private void cargarVistaDetalle(){ appDetalle.setVisible(true);}

    @FXML
    private void volverPrincipalL(){
        appLista.setVisible(false);
    }

}
