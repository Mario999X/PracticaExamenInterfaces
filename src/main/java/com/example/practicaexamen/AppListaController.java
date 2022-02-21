package com.example.practicaexamen;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;

public class AppListaController {

    @FXML
    private StackPane appLista;

    @FXML
    private ListView vistaLista;

    public void cargarVistaLista(ObservableList<Animal> listaDatos){
        vistaLista.setItems(listaDatos);
    }


    @FXML
    private void volverPrincipalL(){
        appLista.setVisible(false);
    }
}
