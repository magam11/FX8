package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class DataController {
    @FXML
    public Label label1;
    @FXML
    public Label label2;
    @FXML
    public Button button;

    @FXML
    public AnchorPane box;

    public void setInfo(String string)
    {
        label1.setText(string);
        label2.setText(string);
    }

    public AnchorPane getBox() {
        return box;
    }
}
