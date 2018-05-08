package model;

public class ContributorGroup {

	private int gid;
	private String name;

	public ContributorGroup(int gid, String name) {
		this.gid = gid;
		this.name = name;
	}

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
