package com.example.practicaexamen;

import javafx.fxml.FXML;
import javafx.scene.layout.StackPane;

public class AppGrafCircularController {

    @FXML
    private StackPane appGrafCircular;

    @FXML
    private void volverPrincipalGrafC(){
        appGrafCircular.setVisible(false);
    }
}
