package model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Bill {

	private int bid;
	private int sid;
	private String source;
	private ArrayList<Contributor> contributors;
	private int pid;
	private String payer;
	private double total;
	private String remarks;
	private Timestamp date;

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getPayer() {
		return payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public ArrayList<Contributor> getContributors() {
		return contributors;
	}

	public void setContributors(ArrayList<Contributor> contributors) {
		this.contributors = contributors;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

}
