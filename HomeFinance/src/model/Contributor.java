package model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Contributor extends Person{
	
	private SimpleDoubleProperty amount = new SimpleDoubleProperty();

	public Contributor(int pid, String name, Double sum) {
		super(pid, name);
		this.amount.set(sum);
	}

	public Contributor(String name, double amount) {
		super(name);
		this.amount.set(amount);
	
	}

	public SimpleDoubleProperty getSum() {
		return amount;
	}

	public void setSum(double sum) {
		this.amount.set(sum);
	}
	
	public SimpleStringProperty nameProperty(){
		return super.nameProperty();
	}
	
}
