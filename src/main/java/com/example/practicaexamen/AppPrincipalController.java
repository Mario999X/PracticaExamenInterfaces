package com.example.practicaexamen;

import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class AppPrincipalController implements Initializable {

    private boolean desplegado;
    private TranslateTransition animation;
    @FXML
    private HBox hBoxSaludo;


    @FXML
    private StackPane appLista, appTabla, appGrafCircular, appGrafLineas;
    @FXML
    private AppListaController appListaController;
    @FXML
    private AppTablaController appTablaController;
    @FXML
    private AppGrafCircularController appGrafCircularController;
    @FXML
    private AppGrafLineasController appGrafLineasController;

    @FXML
    private ObservableList<Animal> datosLista;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        hBoxSaludo.setTranslateY(100);

        appLista.setVisible(false);
        appTabla.setVisible(false);
        appGrafCircular.setVisible(false);
        appGrafLineas.setVisible(false);

        rellenarLista();

    }

    @FXML
    private void iniciaSaludo() {
        animation = new TranslateTransition(Duration.millis(300), hBoxSaludo);

        if (!desplegado) {
            animation.setFromY(hBoxSaludo.getHeight());
            animation.setToY(0);
            desplegado = true;
        } else {
            animation.setFromY(0);
            animation.setToY(hBoxSaludo.getHeight());
            desplegado = false;
        }
        animation.play();
    }


    public void cargarVistaLista() {
        appLista.setVisible(true);
        appListaController.cargarVistaLista(datosLista);
    }

    public void cargarVistaTabla() {
        appTabla.setVisible(true);
        appTablaController.cargarTabla(datosLista);
    }

    public void cargarVistaGrafCircular() {
        appGrafCircular.setVisible(true);
        appGrafCircularController.cargarDatosPieChart(datosLista);
    }

    public void cargarVistaGrafLineas() {
        appGrafLineas.setVisible(true);
        //appGrafLineasController.iniciarGrafica(datosLista);
    }

    private void rellenarLista() {

        datosLista = FXCollections.observableArrayList(
                new Animal("Lobo", 10, "Vertebrado"),
                new Animal("Tiburon", 5, "Vertebrado"),
                new Animal("Aguila", 2, "Vertebrado"),
                new Animal("Labrador", 5, "Vertebrado"),
                new Animal("Cobra", 1, "Vertebrado"),
                new Animal("Lombriz", 1, "Invertebrado"),
                new Animal("Medusa", 1, "Invertebrado"));

    }

    @FXML
    private void salirApp(){
        System.exit(0);
    }

}
