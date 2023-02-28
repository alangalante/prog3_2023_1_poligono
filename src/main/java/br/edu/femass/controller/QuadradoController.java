package br.edu.femass.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class QuadradoController implements Initializable {

    @FXML
    private TextField TxtX1;    
    
    @FXML
    private TextField TxtY1;

    @FXML
    private TextField TxtX2;    
    
    @FXML
    private TextField TxtY2;

    @FXML
    private TextField TxtArea;

    @FXML
    private TextField TxtPerimetro;

    @FXML
    private void BtnCalcular_click(ActionEvent action) {
        System.out.println("Me clicou");
    }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    }
    
}
