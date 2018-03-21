package Beans;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CellPhoneUserImpl implements CellPhoneUserDao {
	Scanner in = new Scanner(System.in);
	private Map<Long, CellPhoneUser> cellPhoneUserMap = new HashMap<Long, CellPhoneUser>();
	{
		double usedData1 = 0;
		System.out.println("How many megabytes of data have you used Charles?");
		usedData1 = in.nextDouble();

		// String cellUserId, String cellUserName, double data, double usedData
		CellPhoneUser cellPhoneUser1 = new CellPhoneUser(1, "Charles", 2048, usedData1);

		double usedData2 = 0;
		System.out.println("How many megabytes of data have you used Edward?");
		usedData2 = in.nextDouble();

		CellPhoneUser cellPhoneUser2 = new CellPhoneUser(2, "Edward", 2048, usedData2);
		cellPhoneUserMap.put(cellPhoneUser1.getCellUserId(), cellPhoneUser1);
		cellPhoneUserMap.put(cellPhoneUser2.getCellUserId(), cellPhoneUser2);
	}

	public void insert(CellPhoneUser cellPhoneUser) {
		cellPhoneUserMap.put(cellPhoneUser.getCellUserId(), cellPhoneUser);
	}

	public void update(CellPhoneUser cellPhoneUser) {
		cellPhoneUserMap.put(cellPhoneUser.getCellUserId(), cellPhoneUser);
	}

	public void update(List<CellPhoneUser> cellPhoneUsers) {
		for (CellPhoneUser cellPhoneUser : cellPhoneUsers) {
			update(cellPhoneUser);
		}
	}

	public void delete(long CellUserId) {
		cellPhoneUserMap.remove(CellUserId);
	}

	public CellPhoneUser find(long CellUserId) {
		return cellPhoneUserMap.get(CellUserId);
	}

	public List<CellPhoneUser> find(List<Long> CellUserIds) {
		List<CellPhoneUser> cellPhoneUsers = new ArrayList<CellPhoneUser>();
		for (Long id : CellUserIds) {
			cellPhoneUsers.add(cellPhoneUserMap.get(id));
		}
		return cellPhoneUsers;
	}

	public List<CellPhoneUser> find(String cellUserName) {
		List<CellPhoneUser> cellPhoneUsers = new ArrayList<CellPhoneUser>();
		for (CellPhoneUser cellPhoneUser : cellPhoneUserMap.values()) {
			if (cellUserName.equals(cellPhoneUser.getCellUserName())) {
				cellPhoneUsers.add(cellPhoneUser);
			}
		}
		return cellPhoneUsers;
	}
}
