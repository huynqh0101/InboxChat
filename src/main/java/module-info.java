module com.example.demo5 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.demo5 to javafx.fxml;
    exports com.example.demo5;
}