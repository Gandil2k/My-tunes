package dk.easv.mytunes.GUI.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class NewSongController {
    @FXML
    private Button btnSave, btnCancel, btnChooseFile, btnCategoryMore;

    @FXML
    private ComboBox<String> cbbCategory;

    @FXML
    private TextField txtTime, txtFile, txtArtist, txtTitle;

    @FXML
    private void initialize() {
        cbbCategory.getItems().addAll(
                "Pop", "Rock", "Jazz", "Classical", "Hip-Hop",
                "Country", "Reggae", "Electronic", "Blues", "Folk"
        );
        cbbCategory.setEditable(true);
    }
    @FXML
    private void handleSave() {
        String title = txtTitle.getText();
        String artist = txtArtist.getText();
        String category = cbbCategory.getEditor().getText();
        String time = txtTime.getText();
        String file = txtFile.getText();

        if (title.isEmpty() || artist.isEmpty() || category.isEmpty() || time.isEmpty() || file.isEmpty()) {
            System.out.println("All fields are required.");
            return;
        }

        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Genre: " + category);
        System.out.println("Time: " + time);
        System.out.println("File: " + file);
    }

    @FXML
    private void handleCancel() {
        System.out.println("Canceled");
    }
}
