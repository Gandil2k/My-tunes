module dk.easv.mytunes {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.mytunes to javafx.fxml;
    exports dk.easv.mytunes;
    exports dk.easv.mytunes.GUI.Controller;
    opens dk.easv.mytunes.GUI.Controller to javafx.fxml;
}