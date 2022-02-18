module io.dbc.github.pleasely {
    requires javafx.controls;
    requires javafx.fxml;


    opens io.dbc.github.pleasely to javafx.fxml;
    exports io.dbc.github.pleasely;
}