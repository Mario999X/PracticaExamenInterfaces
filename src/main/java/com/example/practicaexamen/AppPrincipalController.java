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
    private StackPane appLista, appTabla, appGrafCircular, appGrafBarras;

    @FXML
    private AppListaController appListaController;
    @FXML
    private AppTablaController appTablaController;
    @FXML
    private AppGrafCircularController appGrafCircularController;
    @FXML
    private AppGrafLineasController appGrafLineasController;

    private ObservableList<Animal> datosLista;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        appLista.setVisible(false);
        appTabla.setVisible(false);
        appGrafCircular.setVisible(false);
        appGrafBarras.setVisible(false);

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

    public void cargarVistaGrafBarras(){
        appGrafBarras.setVisible(true);
    }

    private void cargarLista(){

        datosLista = FXCollections.observableArrayList();
        datosLista.addAll(new Animal("Lobo", 12, "Mamifero"),
                new Animal("Tiburon", 5,"Pez"),
                new Animal("Aguila", 2, "Ave"),
                new Animal("Labrador", 5, "Mamifero"),
                new Animal("Pastor aleman", 7, "Mamifero"));

    }

}