package com.example.practicaexamen;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class AppGrafBarrasController {

    @FXML
    private StackPane appGrafBarras;

    @FXML
    private void volverPrincipalGB(){
        appGrafBarras.setVisible(false);
    }
}
