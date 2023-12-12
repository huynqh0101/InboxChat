package com.example.demo5;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField text1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        text1.setFocusTraversable(false);
    }

}
