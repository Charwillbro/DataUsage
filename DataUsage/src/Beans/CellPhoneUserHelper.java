package Beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import Beans.CellPhoneUser;

public class CellPhoneUserHelper {

	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DataUsage");
	EntityManager em = emfactory.createEntityManager();

	public void insertItem(CellPhoneUser cuh) {

		em.getTransaction().begin();
		em.persist(cuh);
		em.getTransaction().commit();

	}

	public void remove(int i) {

		CellPhoneUser toRemove = em.find(CellPhoneUser.class, i);

		em.getTransaction().begin();
		em.remove(toRemove);
		em.getTransaction().commit();
	}

	public void update(int i, double data) {
		double addData;
		CellPhoneUser toUpdate = em.find(CellPhoneUser.class, i);
		em.getTransaction().begin();
		addData = toUpdate.getData() + data;
		toUpdate.setData(addData);
		em.getTransaction().commit();
	}

	public void getList() {
		EntityManager em = emfactory.createEntityManager();

		TypedQuery<CellPhoneUser> query = em.createQuery("SELECT cellUserId FROM CellPhoneUser cellUserId ",
				CellPhoneUser.class);
		List<CellPhoneUser> results = query.getResultList();

		for (CellPhoneUser c : results) {
			System.out.println("User ID: " + c.getCellUserId() + "--" + c.getCellUserName() + " has " + c.getData()
					+ " MB of Data remaining.");

		}
	}
}
