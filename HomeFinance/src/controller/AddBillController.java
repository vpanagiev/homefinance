package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class AddBillController {

    @FXML
    private TextField payerInput;

    @FXML
    private TextField dateInput;

    @FXML
    private TextField nameInput;

    @FXML
    private TextField totalInput;

    @FXML
    private ListView<?> list;

    @FXML
    private Button select;

    @FXML
    private Button addPerson;

    @FXML
    private Button addNUpdate;

    @FXML
    private Button clear;

    @FXML
    private VBox contributorsPane;

    @FXML
    void addAndUpdate(ActionEvent event) {

    }

    @FXML
    void addContributor(ActionEvent event) {
    	
    	HBox newHBox = new HBox(10);
    	newHBox.setPadding(new Insets(10, 0, 0, 10));
    	newHBox.setAlignment(Pos.CENTER_LEFT);
    	Label newLabel = new Label("example:");
    	TextField newTextField = new TextField();
    	Button newButton = new Button("Remove");
    	
    	newHBox.getChildren().addAll(newLabel,newTextField,newButton);
    	
    	contributorsPane.getChildren().add(newHBox);
    }

    @FXML
    void addPerson(ActionEvent event) {
    	
    
    	
    }

    @FXML
    void clearFields(ActionEvent event) {

    }

}
