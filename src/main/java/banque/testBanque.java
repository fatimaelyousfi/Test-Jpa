package banque;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class testBanque {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction et = em.getTransaction();
		et.begin();
	
	
		Banque banque = new Banque();
		Banque banque1 = new Banque();
		Banque banque2 = new Banque();
		Banque banque3 = new Banque();
		banque.setNom("Credit Agricole");
		banque1.setNom("CIC");
		banque2.setNom("La banque poste");
		banque3.setNom("LCL");


		Set<Client> clientCompte = new HashSet<Client>();
			
		Client client = new Client();
		Client client1 = new Client();
		Client client2 = new Client();
		Client client3 = new Client();
		client.setNom("Dupond");
		client.setPrenom("Roger");
		client.setDateNaissance(LocalDate.of(1956, 02, 26));
		client1.setNom("Richelieu");
		client1.setPrenom("Martine");
		client1.setDateNaissance(LocalDate.of(1986, 11, 23));
		client2.setNom("Martinez");
		client2.setPrenom("Lois");
		client2.setDateNaissance(LocalDate.of(1993, 01, 30));
		client2.setNom("Martinez");
		client2.setPrenom("Sophie");
		client2.setDateNaissance(LocalDate.of(1990, 02, 16));
		client3.setNom("Bernard");
		client3.setPrenom("Roger");
		client3.setDateNaissance(LocalDate.of(1972, 06, 07));
		client.setBanque(banque);
		client1.setBanque(banque1);
		client2.setBanque(banque3);
		client3.setBanque(banque2);
		clientCompte.add(client);
		clientCompte.add(client1);
		clientCompte.add(client2);
		clientCompte.add(client3);
		
		
		Adresse adresse = new Adresse();
		adresse.setVille("Marseille");
		adresse.setCodePostal(13003);
		adresse.setNumero(12);
		adresse.setRue("république");
		
		client.setAdresse(adresse);
		client1.setAdresse(adresse);
		client2.setAdresse(adresse);
		client3.setAdresse(adresse);
		
		
		
		Set<Compte> compteClient = new HashSet<Compte>();
		Set<Compte> compteClient1 = new HashSet<Compte>();
		Set<Compte> compteClient2 = new HashSet<Compte>();
		Set<Compte> compteClient3 = new HashSet<Compte>();
		
		Compte compte = new Compte();
		Compte compte1 = new Compte();
		Compte compte2 = new Compte();
		Compte compte3 = new Compte();
	
		
		compte.setSolde(10256);
		compte.setNumero("abc");
		compte1.setSolde(2684);
		compte1.setNumero("abc");
		compte2.setSolde(356);
		compte2.setNumero("abc");
		compte3.setSolde(150);
		compte3.setNumero("abc");
		compteClient.add(compte);
		compteClient1.add(compte1);
		compteClient2.add(compte2);
		compteClient3.add(compte3);
		
		
		client.setCompte(compteClient);
		client1.setCompte(compteClient1);
		client2.setCompte(compteClient2);
		client1.setCompte(compteClient3);
		client3.setCompte(compteClient);
		
		clientCompte.add(client);
		clientCompte.add(client1);
		clientCompte.add(client2);
		clientCompte.add(client3);
	
		
		Set<Operation> operations = new HashSet<Operation>();
		Operation operation = new Operation();
		Operation operation1 = new Operation();
		Operation operation2 = new Operation();
		operation.setDate(LocalDateTime.now());
		operation.setMontant(156);
		operation.setModif("bibliotheque");
		operation1.setMontant(2530);
		operation1.setModif("voiture");
		operation1.setDate(LocalDateTime.now());
		operation2.setMontant(460);
		operation2.setModif("pc");
		operation2.setDate(LocalDateTime.now());
		
		
		operations.add(operation);
		operations.add(operation1);
		operations.add(operation2);
		operation.setCompte(compte);
		operation1.setCompte(compte1);
		operation2.setCompte(compte3);
		
		
		em.persist(banque);
		em.persist(banque1);
		em.persist(banque2);
		em.persist(banque3);
		
		em.persist(client);
		em.persist(client1);
		em.persist(client2);
		em.persist(client3);
		
		
		em.persist(compte);
		em.persist(compte1);
		em.persist(compte2);
		em.persist(compte3);	
		
		em.persist(operation);
		em.persist(operation1);
		em.persist(operation2);
		
		
		et.commit();
		
		em.close();
		entityManagerFactory.close();
		//em = entityManagerFactory.createEntityManager();

	}
}
