package banque;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


	@Entity
	@Table(name = "Banque")
	public class Banque {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer id; 
		
		@Column(name = "nom", length = 50, nullable = false)
		private String nom;
		
		@OneToMany(mappedBy="banque")
		private Set<Client> client;
		
		
		public Banque(){
			client = new HashSet<Client>();
		}
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Banque [id=" + id + ", nom=" + nom + "]";
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

}
