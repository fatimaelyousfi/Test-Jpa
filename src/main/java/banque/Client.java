package banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import test.java.Emprunt;


	@Entity
	@Table(name = "Client")
	public class Client {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id; 
		
		@Column(name = "nom", length = 50, nullable = false)
		private String nom;
		@Column(name = "prenom", length = 50, nullable = false)
		private String prenom;
		@Column(name = "dateNaissance", length = 50, nullable = false)
		private LocalDate dateNaissance;
		
		@ManyToMany
		@JoinTable(name="compo",
		joinColumns= @JoinColumn(name="id_client", referencedColumnName="id"),
		inverseJoinColumns= @JoinColumn(name="id_compte", referencedColumnName="id")
		)
		private Set<Compte> compte;
		
		@ManyToOne
		@JoinColumn(name="banque_id")
		private Banque banque;
		
		@Embedded
		private Adresse adresse;
		

		public void Client() {
			
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
					+ ", compte=" + compte + ", banque=" + banque + ", adresse=" + adresse + "]";
		}


		/**
		 * @return the id
		 */
		public Integer getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Integer id) {
			this.id = id;
		}

		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}

		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}

		/**
		 * @return the prenom
		 */
		public String getPrenom() {
			return prenom;
		}

		/**
		 * @param prenom the prenom to set
		 */
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		/**
		 * @return the dateNaissance
		 */
		public LocalDate getDateNaissance() {
			return dateNaissance;
		}

		/**
		 * @param dateNaissance the dateNaissance to set
		 */
		public void setDateNaissance(LocalDate dateNaissance) {
			this.dateNaissance = dateNaissance;
		}

		/**
		 * @return the banque
		 */
		public Banque getBanque() {
			return banque;
		}

		/**
		 * @param banque the banque to set
		 */
		public void setBanque(Banque banque) {
			this.banque = banque;
		}

		/**
		 * @return the adresse
		 */
		public Adresse getAdresse() {
			return adresse;
		}

		/**
		 * @param adresse the adresse to set
		 */
		public void setAdresse(Adresse adresse) {
			this.adresse = adresse;
		}

		

		/**
		 * @return the compte
		 */
		public Set<Compte> getCompte() {
			return compte;
		}

		/**
		 * @param compte the compte to set
		 */
		public void setCompte(Set<Compte> compte) {
			this.compte = compte;
		}

		
		

		
		
}
