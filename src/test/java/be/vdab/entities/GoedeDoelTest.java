package be.vdab.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class GoedeDoelTest {
	private static final String NAAM = "CliniClowns";
	private GoedeDoel doel;

	@Before
	public void before() {
		doel = new GoedeDoel(NAAM);
	}

	@Test
	public void getNaam() {
		assertEquals(NAAM, doel.getNaam());
	}

	@Test
	public void eenNieuwDoelHeeftNogNietsOpgebracht() {
		assertEquals(0, doel.getOpgebracht().compareTo(BigDecimal.ZERO));
	}

	@Test
	public void goedeDoelenMetDezelfdeNaamMoetenVolgensEqualsGelijkZijn() {
		assertEquals(new GoedeDoel("CLINICLOWNS"), doel);
	}

	@Test
	public void goedeDoelenMetVerschillendeNaamMoetenVolgensEqualsVerschillendZijn() {
		assertNotEquals(new GoedeDoel("Unicef"), doel);
		// extra import: import static org.junit.Assert.assertNotEquals;
	}

	@Test
	public void goedDoelVerschiltVanEenObjectMetEenAnderType() {
		assertNotEquals(doel, new Date());
	}
}
