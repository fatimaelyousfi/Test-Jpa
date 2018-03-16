package test.java;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


public class TestJpa {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_BLUE = "\u001B[34m";
	
	public static void main(String[] args) {
	
		
		//EntityTransaction et = em.getTransaction();
		//et.begin();
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("monTest");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		
		/*Livre l0 = em.find(Livre.class, 1);
		System.out.println(l0);
		
	
		Query query= em.createQuery("select l from Livre l where l.titre='Germinal'");
		Livre l = (Livre) query.getResultList().get(0);
		System.out.println(l);
	
		
		TypedQuery<Livre> query2 = em.createQuery("select l1 from Livre l1 where l1.auteur= 'Gaston Pouet'", Livre.class);
		Livre l1=query2.getResultList().get(0);
		System.out.println(l1);
		*/
		
		System.out.println(ANSI_RESET + "####################################___MON_TEST_JPA___######################################\n" + ANSI_RESET);
		
		Query query3= em.createQuery("select e from Emprunt e where e.id=1");
		Emprunt e = (Emprunt) query3.getSingleResult();
		Set<Livre> setLivre= e.getLivres();
		 for (Livre l3: setLivre){
			 System.out.println(ANSI_BLUE + "Le titre du livre est: \n"+ ANSI_RESET + l3.getTitre() + ANSI_PURPLE +"\n Auteur: \n" + ANSI_RESET + l3.getAuteur()+ " \n");
		 }
		 
		System.out.println("\n########################################### : ) #############################################");
		
		em.close();
		entityManagerFactory.close();
		em = entityManagerFactory.createEntityManager();
		

	}

}
