package Beans;

public class CellPhoneUser {

	double cellUserId;
	double data;
	double usedData;
	String cellUserName;

	public CellPhoneUser() {

	}

	public CellPhoneUser(double cellUserId, String cellUserName, double data, double usedData) {
		this.cellUserId = cellUserId;
		this.cellUserName = cellUserName;
		this.data = data;
		this.usedData = usedData;
	}

	public double getCellUserId() {
		return cellUserId;
	}

	public void setCellUserId(double cellUserId) {
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
