package Beans;

public interface CellPhoneUserService {

	public void addData(long cellUserId, double amount);

	public CellPhoneUser getCellPhoneUser(long cellUserId);

	public void userDataUsage(long cellUserId);

}
