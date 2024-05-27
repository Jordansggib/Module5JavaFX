module k.module5javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens k.module5javafx to javafx.fxml;
    exports k.module5javafx;
}