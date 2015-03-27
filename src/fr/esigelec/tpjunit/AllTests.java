package fr.esigelec.tpjunit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ VoitureTest.class, GarageTest.class })
public class AllTests {

}
