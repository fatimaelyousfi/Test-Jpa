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


		Set<Client> clients = new HashSet<Client>();
			
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
		clients.add(client);
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
		
		
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
		
		LivretA livret = new LivretA();
		LivretA livret1 = new LivretA();
		AssuranceVie assuranceVie = new AssuranceVie();
		AssuranceVie assuranceVie1 = new AssuranceVie();
		
		
		livret.setSolde(10256);
		livret.setNumero("abc");
		livret.setTaux(10);
		livret1.setSolde(2684);
		livret1.setNumero("abc");
		livret1.setTaux(12);
		assuranceVie.setSolde(356);
		assuranceVie.setNumero("abc");
		assuranceVie.setTaux(20);
		assuranceVie.setDateFin(LocalDate.of(2017, 02, 25));
		assuranceVie1.setSolde(150);
		assuranceVie1.setNumero("abc");
		assuranceVie1.setTaux(32);
		assuranceVie1.setDateFin(LocalDate.of(2017, 03, 24));

		compteClient.add(livret);
		compteClient1.add(livret1);
		compteClient2.add(assuranceVie);
		compteClient3.add(assuranceVie1);
		
	
		client.setCompte(compteClient);
		client2.setCompte(compteClient2);
		client1.setCompte(compteClient3);
		client3.setCompte(compteClient1);
		
		clients.add(client);
		clients.add(client1);
		clients.add(client2);
		clients.add(client3);
	
		
		Set<Operation> operations = new HashSet<Operation>();
		Virement operation = new Virement();
		Virement operation1 = new Virement();
		Virement operation2 = new Virement();
		operation.setDate(LocalDateTime.now());
		operation.setMontant(156);
		operation.setBeneficiaire("François");
		operation.setModif("bibliotheque");
		operation1.setMontant(2530);
		operation1.setModif("voiture");
		operation1.setBeneficiaire("Alice");
		operation1.setDate(LocalDateTime.now());
		operation2.setMontant(460);
		operation2.setModif("pc");
		operation2.setDate(LocalDateTime.now());
		operation2.setBeneficiaire("loise");
		
		
		operations.add(operation);
		operations.add(operation1);
		operations.add(operation2);
		operation.setCompte(livret);
		operation1.setCompte(livret1);
		operation2.setCompte(assuranceVie1);
		
		
		em.persist(banque);
		em.persist(banque1);
		em.persist(banque2);
		em.persist(banque3);
		
		em.persist(client);
		em.persist(client1);
		em.persist(client2);
		em.persist(client3);
		
		
		em.persist(livret);
		em.persist(livret1);
		em.persist(assuranceVie);
		em.persist(assuranceVie1);	
		
		em.persist(operation);
		em.persist(operation1);
		em.persist(operation2);
		
		
		et.commit();
		
		em.close();
		entityManagerFactory.close();

	}
}
