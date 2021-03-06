package Beans;

public class CellPhoneUserServiceImpl implements CellPhoneUserService {

	private CellPhoneUserDao cellPhoneUserDao;

	public CellPhoneUserDao getCellPhoneUserDao() {
		return cellPhoneUserDao;
	}

	public void setCellPhoneUserDao(CellPhoneUserDao cellPhoneUserDao) {
		this.cellPhoneUserDao = cellPhoneUserDao;
	}

	public void userDataUsage(int cellUserId) {
		CellPhoneUser cellPhoneUser = cellPhoneUserDao.find(cellUserId);
		cellPhoneUser.setData(cellPhoneUser.getData() - cellPhoneUser.getUsedData());
		cellPhoneUserDao.update(cellPhoneUser);

	}

	public void addData(int cellUserId, double amount) {
		CellPhoneUser cellPhoneUser = cellPhoneUserDao.find(cellUserId);
		cellPhoneUser.setData(cellPhoneUser.getData() + amount);
		cellPhoneUserDao.update(cellPhoneUser);

	}

	public CellPhoneUser getCellPhoneUser(int cellUserId) {
		return cellPhoneUserDao.find(cellUserId);
	}

}
