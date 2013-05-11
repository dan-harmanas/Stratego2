/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utcn.stratego.strategogame.game;

import javafx.geometry.Orientation;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Dan
 */
public class LobyController {
    private AnchorPane root,sp1left,sp1right;
    private SplitPane sp1;
    private Accordion ac;
    private TitledPane allPlayers,friends;


    public LobyController(AnchorPane root) {
        this.root = root;
        init();
    }
    private void init()
    {
        sp1 = new SplitPane();
        sp1.setOrientation(Orientation.HORIZONTAL);
        sp1left = new AnchorPane();
        allPlayers = new TitledPane();
        allPlayers.setText("All Players Loby");
        friends = new TitledPane();
        friends.setText("Friends Loby");
        ac = new Accordion();
        ac.getPanes().addAll(allPlayers,friends);
        AnchorPane.setBottomAnchor(ac, 0.0);
        AnchorPane.setTopAnchor(ac, 0.0);
        AnchorPane.setLeftAnchor(ac, 0.0);
        AnchorPane.setRightAnchor(ac, 0.0);
        sp1left.getChildren().add(ac);
        sp1.getItems().add(sp1left);
        sp1right = new AnchorPane();
        Button b1 = new Button("Merge");
        sp1right.getChildren().add(b1);
        sp1.getItems().add(sp1right);
        sp1.setStyle("-fx-background-color: rgba(0, 100, 100, 0.1); -fx-background-radius: 10;");
        AnchorPane.setBottomAnchor(sp1, 0.0);
        AnchorPane.setTopAnchor(sp1, 0.0);
        AnchorPane.setLeftAnchor(sp1, 0.0);
        AnchorPane.setRightAnchor(sp1, 0.0);
        sp1.setDividerPositions(0.3f);
        root.getChildren().add(sp1);
        
    }
    
    
}
