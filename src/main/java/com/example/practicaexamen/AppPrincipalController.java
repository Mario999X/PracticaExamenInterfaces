package com.example.practicaexamen;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AppPrincipalController implements Initializable {

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
        appLista.setVisible(false);
        appTabla.setVisible(false);
        appGrafCircular.setVisible(false);
        appGrafLineas.setVisible(false);

        cargarLista();


    }


    public void cargarVistaLista(){
        appLista.setVisible(true);
        appListaController.cargarVistaLista(datosLista);
    }

    public void cargarVistaTabla(){
        appTabla.setVisible(true);
        appTablaController.cargarTabla(datosLista);
    }

    public void cargarVistaGrafCircular(){
        appGrafCircular.setVisible(true);
        appGrafCircularController.cargarDatosPieChart(datosLista);
    }

    public void cargarVistaGrafLineas(){
        appGrafLineas.setVisible(true);
        //appGrafLineasController.iniciarGrafica(datosLista);
    }

    private void cargarLista(){

        datosLista = FXCollections.observableArrayList(
                new Animal("Lobo", 12, "Mamifero", 0.7),
                new Animal("Tiburon", 5,"Pez", 0.9),
                new Animal("Aguila", 2, "Ave", 0.8),
                new Animal("Labrador", 5, "Mamifero", 0.1),
                new Animal("Pastor aleman", 7, "Mamifero", 0.6),
                new Animal("Cobra", 2, "Reptil", 0.4));

    }

}