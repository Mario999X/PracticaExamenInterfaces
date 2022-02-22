package com.example.practicaexamen;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class AppGrafLineasController {

    @FXML
    private StackPane appGrafLineas;

    @FXML
    private void volverPrincipalGB(){
        appGrafLineas.setVisible(false);
    }
}
