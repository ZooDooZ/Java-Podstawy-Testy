module com.example.javapodstawytesty {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javapodstawytesty to javafx.fxml;
    exports com.example.javapodstawytesty;
}