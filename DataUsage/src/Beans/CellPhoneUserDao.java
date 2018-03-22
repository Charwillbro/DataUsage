package Beans;
import java.util.List;

public interface CellPhoneUserDao {

	public void insert(CellPhoneUser cellPhoneUser);

	public void update(CellPhoneUser cellPhoneUser);

	public void update(List<CellPhoneUser> cellPhoneUsers);

	public void delete(double cellUserId);

	public CellPhoneUser find(double cellUserId);

	public List<CellPhoneUser> find(List<Double> cellUserIds);

	public List<CellPhoneUser> find(String cellUserName);
}
