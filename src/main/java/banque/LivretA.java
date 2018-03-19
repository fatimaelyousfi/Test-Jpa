package banque;

import javax.persistence.Entity;


@Entity
public class LivretA extends Compte{
	
	
	private double taux;

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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}


}
