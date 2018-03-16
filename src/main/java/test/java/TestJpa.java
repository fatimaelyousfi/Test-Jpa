package test.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestJpa {

	public static void main(String[] args) {
	
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("monTest");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		em.close();
		entityManagerFactory.close();

	}

}
