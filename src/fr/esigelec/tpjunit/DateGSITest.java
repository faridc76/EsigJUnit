package fr.esigelec.tpjunit;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Sébastien Serais
 * @version 1.0
 */
public class DateGSITest {
	@Test
	public void testDateGSI() {
		DateGSI d1=new DateGSI(12,10,2020);
		assertEquals(12,d1.jour);
		assertEquals(10,d1.mois);
		assertEquals(2020,d1.annee);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testDateGSI2() {
		new DateGSI(0,10,2020);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testDateGSI3() {
		new DateGSI(10,0,2020);
	}
	@Test(expected=IllegalArgumentException.class)
	public void testDateGSI4() {
		new DateGSI(10,10,0);
	}
	@Test
	public void testGetDateLendemain() {
		DateGSI d1=new DateGSI(12,10,2020);
		DateGSI d2=d1.getDateLendemain();
		assertEquals(13,d2.jour);
		assertEquals(10,d2.mois);
		assertEquals(2020,d2.annee);
		d1=new DateGSI(31,12,2020);
		d2=d1.getDateLendemain();
		assertEquals(1,d2.jour);
		assertEquals(1,d2.mois);
		assertEquals(2021,d2.annee);
		d1=new DateGSI(28,2,2012);
		d2=d1.getDateLendemain();
		assertEquals(29,d2.jour);
		assertEquals(2,d2.mois);
		assertEquals(2012,d2.annee);
		d1=new DateGSI(28,2,2013);
		d2=d1.getDateLendemain();
		assertEquals(1,d2.jour);
		assertEquals(3,d2.mois);
		assertEquals(2013,d2.annee);
		d1=new DateGSI(28,2,2000);
		d2=d1.getDateLendemain();
		assertEquals(29,d2.jour);
		assertEquals(2,d2.mois);
		assertEquals(2000,d2.annee);
		d1=new DateGSI(28,2,2000);
		d2=d1.getDateLendemain();
		assertNotSame(d1,d2);
		d1=new DateGSI(3,10,2000);
		d2=d1;
		d1.getDateLendemain();
		assertEquals(3,d1.jour);
		assertEquals(10,d1.mois);
		assertEquals(2000,d1.annee);
		assertSame(d2,d1);
	}
	@Test
	public void testEqualsObject() {
		DateGSI d1=new DateGSI(12,10,2020);
		DateGSI d2=new DateGSI(12,10,2020);
		assertEquals(d1,d2);
		DateGSI d3=new DateGSI(12,10,20);
		assertFalse(d2.equals(d3));
		String s="sebastien serais";
		assertFalse(d2.equals(s));
	}
	@Test
	public void testToString() {
		DateGSI d1=new DateGSI(12,10,2020);
		assertEquals("12/10/2020",d1.toString());
		d1=new DateGSI(9,10,2020);
		assertEquals("09/10/2020",d1.toString());
		d1=new DateGSI(9,1,2020);
		assertEquals("09/01/2020",d1.toString());
	}
}
