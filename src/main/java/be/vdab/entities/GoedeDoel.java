package be.vdab.entities;

import java.math.BigDecimal;

/**
 * Een <strong>goed doel</strong> waarvoor men geld inzamelt
 * @author Johan.Dullaert
 *
 */
public class GoedeDoel {
	private final String naam;
	private BigDecimal opgebracht = BigDecimal.ZERO;

	/**
	 * Maakt een GoedeDoel object 
	 * en dit is een voorbeeld van slechte javadoc want dit is een constructor in deze class, 
	 * wat zou die anders doen?
	 * 
	 * @param naam De naam van het goede doel
	 */
	public GoedeDoel(String naam) {
		this.naam = naam;
	}

	/**
	 * geeft de naam terug, jeeesus...
	 * @return de naam
	 */
	public String getNaam() {
		return naam;
	}

	/**
	* Geeft terug hoeveel &euro; dit doel heeft opgebracht
	* @return het opgebracht bedrag
	*/
	public BigDecimal getOpgebracht() {
		return opgebracht;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof GoedeDoel)) {
			return false;
		}
		return ((GoedeDoel) object).naam.equalsIgnoreCase(this.naam);
	}

	@Override
	public int hashCode() {
		return this.naam.toUpperCase().hashCode();
	}
}
