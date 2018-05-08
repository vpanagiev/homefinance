package controller;

import java.util.List;

import database.OverviewTabQueries;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Contributor;
import model.OverviewTable;
import model.Person;

public class OverviewController{

    @FXML
    private TableView<OverviewTable> tableView;

    @FXML
    private TableColumn<OverviewTable, String> userColumn;

    @FXML
    private TableColumn<OverviewTable, Double> incomeColumn;

    @FXML
    private TableColumn<OverviewTable, Double> expensesColumn;

    @FXML
    private TableColumn<OverviewTable, Double> totalGeneralColumn;

    @FXML
    private TableColumn<OverviewTable, List<Contributor>> personDueColumn;

    @FXML
    private TableColumn<?, ?> amountDueColumn;

    @FXML
    private TableColumn<?, ?> totalDueColumn;

    @FXML
    private TableColumn<?, ?> personOweColumn;

    @FXML
    private TableColumn<?, ?> amountOwnColumn;

    @FXML
    private TableColumn<?, ?> totalOweColumn;

	public void initialize() {
		
		userColumn.setCellValueFactory(new PropertyValueFactory<>("user"));
		incomeColumn.setCellValueFactory(new PropertyValueFactory<>("income"));
		expensesColumn.setCellValueFactory(new PropertyValueFactory<>("expenses"));
		totalGeneralColumn.setCellValueFactory(new PropertyValueFactory<>("generalTotal"));
		//personDueColumn.setCellValueFactory(new PropertyValueFactory<>("duePersons"));
		
		tableView.setItems(OverviewTabQueries.getUsers());
		
		
	}

}
