package model;

import java.util.ArrayList;
import java.util.List;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class OverviewTable {

	private SimpleStringProperty user = new SimpleStringProperty();
	private SimpleDoubleProperty income = new SimpleDoubleProperty();
	private SimpleDoubleProperty expenses = new SimpleDoubleProperty();
	private SimpleDoubleProperty generalTotal = new SimpleDoubleProperty();
	private ObservableList<Contributor> duePersons = FXCollections.observableArrayList();
	private ObservableList<Contributor> owePersons = FXCollections.observableArrayList();
	
	public OverviewTable(String user){
		this.user.set(user);
	}
	
	public OverviewTable(String user, double income, double expenses) {
		this.user.set(user);
		this.income.set(income);
		this.expenses.set(expenses);
		this.generalTotal.set(income-expenses);;
	}

	public SimpleStringProperty userProperty() {
		return user;
	}

	public void setUser(String user) {
		this.user.set(user);
	}

	public SimpleDoubleProperty incomeProperty() {
		return income;
	}

	public void setIncome(double income) {
		this.income.set(income);
	}

	public SimpleDoubleProperty expensesProperty() {
		return expenses;
	}

	public void setExpenses(double expenses) {
		this.expenses.set(expenses);
	}

	public void setGeneralTotal(){
		this.generalTotal.set(this.income.doubleValue() - this.expenses.doubleValue());
	}
	
	public SimpleDoubleProperty generalTotalProperty() {
		return generalTotal;
	}


	public List<Contributor> duePersonsProperty() {
		return duePersons;
	}

	public void setDuePersons(ObservableList<Contributor> duePersons) {
		this.duePersons = duePersons;
	}

	public List<Contributor> getOwePersons() {
		return owePersons;
	}

	public void setOwePersons(ObservableList<Contributor> owePersons) {
		this.owePersons = owePersons;
	}
	
	public void addDuePersons(Contributor contributor){
		this.duePersons.add(contributor);
	}
	
	public void addPersons(Contributor contributor){
		this.duePersons.add(contributor);
	}

}
