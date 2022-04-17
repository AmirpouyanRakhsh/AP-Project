module com.company.approject {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.company.approject to javafx.fxml;
    exports com.company.approject;
}