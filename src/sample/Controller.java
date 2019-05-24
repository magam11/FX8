package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Callback;

import java.io.IOException;
import java.util.List;

public class Controller {
    @FXML
    public ListView<DataController> listView;
    ObservableList observableList = FXCollections.observableArrayList();

    public Controller() {
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/listview.fxml"));
//        fxmlLoader.setController(this);
//        try
//        {
//            Parent parent = (Parent)fxmlLoader.load();
//            Scene scene = new Scene(parent, 400.0 ,500.0);
//        }
//        catch (IOException e)
//        {
//            throw new RuntimeException(e);
//        }
    }


    public void initialize() {

    }

    public void fill_List() {
        setListView();
//        ObservableList<ImageView> items = FXCollections.observableArrayList();
        DataController data = new DataController();
//
//        for (int i = 0; i < 3; i++) {
//            DataController data = new DataController();
//            data.setInfo("text "+i);
//            setGraphic(data.getBox());
//        }
//        listView.setItems(items);
    }

    public void setListView() {
        observableList.add("poxos");
        listView.setItems(observableList);
        listView.setCellFactory(new Callback<ListView<DataController>, ListCell<DataController>>() {
            @Override
            public ListCell<DataController> call(ListView<DataController> param) {
                return new ListViewCell();
            }
        });
    }

    private class ListViewCell extends ListCell<DataController> {

        @Override
        public void updateItem(DataController string, boolean empty) {
            super.updateItem(string, empty);
            if (string != null) {
                DataController data = new DataController();
                data.setInfo("");
                setGraphic(data.getBox());
            }
        }
    }
}
