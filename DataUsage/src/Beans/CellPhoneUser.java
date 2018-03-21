package Beans;

public class CellPhoneUser {

	long cellUserId;
	double data;
	double usedData;
	String cellUserName;

	public CellPhoneUser() {

	}

	public CellPhoneUser(long cellUserId, String cellUserName, double data, double usedData) {
		this.cellUserId = cellUserId;
		this.cellUserName = cellUserName;
		this.data = data;
		this.usedData = usedData;
	}

	public long getCellUserId() {
		return cellUserId;
	}

	public void setCellUserId(long cellUserId) {
		this.cellUserId = cellUserId;
	}

	public double getData() {
		return data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public double getUsedData() {
		return usedData;
	}

	public void setUsedData(double usedData) {
		this.usedData = usedData;
	}

	public String getCellUserName() {
		return cellUserName;
	}

	public void setCellUserName(String cellUserName) {
		this.cellUserName = cellUserName;
	}

}
