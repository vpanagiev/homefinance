package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.Contributor;
import model.OverviewTable;

public class OverviewTabQueries {
	
	public static ObservableList<OverviewTable> getUsers(){
		
		String selectSQL = "SELECT p.pid,p.name FROM Person p";
		
	
		
		ObservableList<OverviewTable> users = FXCollections.observableArrayList();
		
		try(Connection con = Database.getConnection()){
			con.setAutoCommit(false);
			try(PreparedStatement pStatement = con.prepareStatement(selectSQL)){
				try(ResultSet rs = pStatement.executeQuery()){
					while(rs.next()){
						OverviewTable overviewTable = new OverviewTable(rs.getString(2));
						
						getIncome(rs.getInt(1),overviewTable,con);
						getExpenses(rs.getInt(1), overviewTable, con);
						overviewTable.setGeneralTotal();
						
						getDueUsers(rs.getInt(1), overviewTable, con);
						//getOweUsers(rs.getInt(1), overviewTable, con);
						
						users.add(overviewTable);
						con.commit();
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
	}
	
	private static void getIncome(int pid, OverviewTable overviewTable, Connection con) throws SQLException{
		
		String selectSQL = "SELECT sum(i.amount) FROM income i WHERE i.pid=? GROUP BY i.pid";
		
		try(PreparedStatement pStatement = con.prepareStatement(selectSQL)){
			pStatement.setInt(1,pid);
			try(ResultSet rs = pStatement.executeQuery()){
				while(rs.next()){
					overviewTable.setIncome(rs.getDouble(1));
				}
			}
		}
	}
	
	private static void getExpenses(int pid, OverviewTable overviewTable, Connection con) throws SQLException{
		
		String selectSQL = "SELECT sum(b.total) FROM bill b WHERE b.payer=? GROUP BY b.payer";
		
		try(PreparedStatement pStatement = con.prepareStatement(selectSQL)){
			pStatement.setInt(1,pid);
			try(ResultSet rs = pStatement.executeQuery()){
				while(rs.next()){
					overviewTable.setExpenses(rs.getDouble(1));
				}
			}
		}
	}
	
	private static void getDueUsers(int pid, OverviewTable overviewTable, Connection con) throws SQLException{
		
		String selectSQL = "SELECT p.name, ind.amount FROM indebted ind JOIN person p ON ind.contributor=p.pid WHERE ind.payer=?";
		
		try(PreparedStatement pStatement = con.prepareStatement(selectSQL)){
			pStatement.setInt(1, pid);
			try(ResultSet rs = pStatement.executeQuery()){
				while(rs.next()){
					overviewTable.addDuePersons(new Contributor(rs.getString(1), rs.getDouble(2)));
				}
			}
		}
	}
	
	
	private static void getOweUsers(int pid, OverviewTable overviewTable, Connection con) throws SQLException{
		
	}
}
