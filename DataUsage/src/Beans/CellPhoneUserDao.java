package Beans;

import java.util.List;

public interface CellPhoneUserDao {

	public void insert(CellPhoneUser cellPhoneUser);

	public void update(CellPhoneUser cellPhoneUser);

	public void update(List<CellPhoneUser> cellPhoneUsers);

	public void delete(int cellUserId);

	public CellPhoneUser find(int cellUserId);

	public List<CellPhoneUser> find(List<Integer> cellUserIds);

	public List<CellPhoneUser> find(String cellUserName);
}
