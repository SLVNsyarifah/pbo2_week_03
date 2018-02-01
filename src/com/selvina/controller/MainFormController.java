/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.selvina.controller;

import com.selvina.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Selvina (1172149)
 */
public class MainFormController implements Initializable {

    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnAAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/FormA.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage stageA = new Stage();
            stageA.setScene(scene);
            stageA.setTitle("PBO2 JavaFX Stage");
//            stageA.initOwner(borderPane.getScene().getWindow());
//            stageA.initModality(Modality.APPLICATION_MODAL);
            stageA.show();
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnBAction(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/FormB.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage stageB = new Stage();
            stageB.setScene(scene);
            stageB.setTitle("PBO2 JavaFX Stage");
            stageB.initOwner(borderPane.getScene().getWindow());
            stageB.initModality(Modality.WINDOW_MODAL);
            stageB.show();
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnCAction(ActionEvent event) {
    }

}
