package tutoJUnit;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CuveTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("setUp");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	public void testCuve() {
		Cuve c = new Cuve(100.0, 200.0);
		Assert.assertEquals(100.0, c.quantite, 0.001);
		Assert.assertEquals(200.0, c.quantiteMax, 0.001);
	}

	@Test
	public void testRemplir() {
		Cuve c = new Cuve(100.0, 200.0);
		c.remplir(50.0);
		Assert.assertEquals(150.0, c.quantite, 0.001);
		c.remplir(300.0);
		Assert.assertEquals(200.0, c.quantite, 0.001);
		c.remplir(-10.0);
		Assert.assertEquals(200.0,c.quantite,0.001);
	}

	@Test
	public void testVider() {
		System.out.println("testVider");
	}

	@Test
	public void testToString() {
		System.out.println("testToString");
	}

}
