package banque;


import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Adresse {
 
	
	@Column(name = "numero", length = 50, nullable = false)
	private int numero;
	@Column(name = "rue", length = 50, nullable = false)
	private String rue;
	@Column(name = "codePostal", length = 50, nullable = false)
	private int codePostal;
	@Column(name = "ville", length = 50, nullable = false)
	private String Ville;
	
	
	public void Adresse() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", codePostal=" + codePostal + ", Ville=" + Ville + "]";
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * @param rue
	 *            the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * @param codePostal
	 *            the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * @return the ville
	 */
	public String getVille() {
		return Ville;
	}

	/**
	 * @param ville
	 *            the ville to set
	 */
	public void setVille(String ville) {
		Ville = ville;
	}
}
