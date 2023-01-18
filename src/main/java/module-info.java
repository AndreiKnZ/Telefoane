module com.example.telefoanele {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.telefoanele to javafx.fxml;
    exports com.example.telefoanele;
}