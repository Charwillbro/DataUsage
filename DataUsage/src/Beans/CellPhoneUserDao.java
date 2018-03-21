package Beans;
import java.util.List;

public interface CellPhoneUserDao {

	public void insert(CellPhoneUser cellPhoneUser);

	public void update(CellPhoneUser cellPhoneUser);

	public void update(List<CellPhoneUser> cellPhoneUsers);

	public void delete(long cellUserId);

	public CellPhoneUser find(long cellUserId);

	public List<CellPhoneUser> find(List<Long> cellUserIds);

	public List<CellPhoneUser> find(String cellUserName);
}
