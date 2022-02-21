package com.example.practicaexamen;

import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.layout.StackPane;

public class AppTablaController {

    @FXML
    private StackPane appTabla;

    @FXML
    private TableView vistaTabla;

    @FXML
    private void volverPrincipalT(){
        appTabla.setVisible(false);
    }

}
