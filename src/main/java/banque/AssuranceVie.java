package banque;

import java.time.LocalDate;

import javax.persistence.Entity;



@Entity
public class AssuranceVie extends Compte {
	
	private double taux;
	
	private LocalDate dateFin;
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AssuranceVie [taux=" + taux + ", dateFin=" + dateFin + "]";
	}

	/**
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	/**
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	

	
}
