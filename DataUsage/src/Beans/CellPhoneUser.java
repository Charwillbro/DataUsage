package Beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cellphoneuser")
public class CellPhoneUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cellUserId")
	int cellUserId;
	@Column(name = "data")
	double data;
	@Column(name = "usedData")
	double usedData;
	@Column(name = "cellUserName")
	String cellUserName;

	public CellPhoneUser() {

	}

	public CellPhoneUser(int cellUserId, String cellUserName, double data, double usedData) {
		this.cellUserId = cellUserId;
		this.cellUserName = cellUserName;
		this.data = data;
		this.usedData = usedData;
	}

	public CellPhoneUser(String cellUserName, double data, double usedData) {

		this.cellUserName = cellUserName;
		this.data = data;
		this.usedData = usedData;
	}

	public CellPhoneUser(int cellUserId) {
		super();
		this.cellUserId = cellUserId;
	}

	public int getCellUserId() {
		return cellUserId;
	}

	public CellPhoneUser(double data, String cellUserName) {
		super();
		this.data = data;
		this.cellUserName = cellUserName;
	}

	public void setCellUserId(int cellUserId) {
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
