package Beans;

public interface CellPhoneUserService {

	public void addData(double cellUserId, double amount);

	public CellPhoneUser getCellPhoneUser(double cellUserId);

	public void userDataUsage(double cellUserId);

}
