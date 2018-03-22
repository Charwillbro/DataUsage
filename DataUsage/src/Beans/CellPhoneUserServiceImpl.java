package Beans;

public class CellPhoneUserServiceImpl implements CellPhoneUserService {

	private CellPhoneUserDao cellPhoneUserDao;

	public CellPhoneUserDao getCellPhoneUserDao() {
		return cellPhoneUserDao;
	}

	public void setCellPhoneUserDao(CellPhoneUserDao cellPhoneUserDao) {
		this.cellPhoneUserDao = cellPhoneUserDao;
	}

	public void userDataUsage(double cellUserId) {
		CellPhoneUser cellPhoneUser = cellPhoneUserDao.find(cellUserId);
		cellPhoneUser.setData(cellPhoneUser.getData() - cellPhoneUser.getUsedData());
		cellPhoneUserDao.update(cellPhoneUser);

	}

	public void addData(double cellUserId, double amount) {
		CellPhoneUser cellPhoneUser = cellPhoneUserDao.find(cellUserId);
		cellPhoneUser.setData(cellPhoneUser.getData() + amount);
		cellPhoneUserDao.update(cellPhoneUser);

	}

	public CellPhoneUser getCellPhoneUser(double cellUserId) {
		return cellPhoneUserDao.find(cellUserId);
	}

}
