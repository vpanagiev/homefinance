package model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Person {

	private SimpleIntegerProperty pid = new SimpleIntegerProperty();
	private SimpleStringProperty name = new SimpleStringProperty();

	public Person(String name) {
		this.name.set(name);

	}

	public Person(int pid, String name) {
		this.pid.set(pid);
		this.name.set(name);
	}

	public SimpleIntegerProperty pidProperty() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid.set(pid);
	}

	public SimpleStringProperty nameProperty() {
		return name;
	}

	public void setName(String name) {
		this.name.set(name);
	}

}
