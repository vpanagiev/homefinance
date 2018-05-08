package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {

	private static final String TYPE = "mysql";
	private static final String SERVER = "localhost";
	private static final int PORT = 3306;
	private static final String DATABASE = "hm_test";
	private static final String USER = "root";
	private static final String PASSWORD = "rootpass";

	private static final String URL = "jdbc:" + TYPE + "://" + SERVER + ":" + PORT + "/" + DATABASE;

	private Database() {
	}

	public static Connection getConnection() throws SQLException {

		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
