package Beans;

public interface CellPhoneUserService {

	public void addData(int cellUserId, double amount);

	public CellPhoneUser getCellPhoneUser(int cellUserId);

	public void userDataUsage(int cellUserId);

}
