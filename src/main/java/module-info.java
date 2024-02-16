module com.example.ishanpreettest1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.ishanpreettest1 to javafx.fxml;
    exports com.example.ishanpreettest1;
}