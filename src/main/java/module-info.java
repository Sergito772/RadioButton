module com.example.radiobutton {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.radiobutton to javafx.fxml;
    exports com.example.radiobutton;
}