/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utcn.stratego.strategogame.game;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import org.apache.commons.lang.StringUtils;

/**
 * FXML Controller class
 *
 * @author Dan
 */
public class IndexController implements Initializable {
    @FXML
    private AnchorPane root;
    @FXML
    private Button LobyButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
   
      @FXML
    public void LobyMatch() {
          root.getChildren().clear();
          new LobyController(root);

      
    }
    
}
