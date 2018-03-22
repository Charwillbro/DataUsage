package Beans;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Beans.CellPhoneUser;

public class CellPhoneUserHelper {
	
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("DataUsage");

	public void insertItem(CellPhoneUser cuh) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(cuh);
		em.getTransaction().commit();
		em.close();

	}
}
