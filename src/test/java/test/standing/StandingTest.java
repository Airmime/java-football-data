package test.standing;

import static org.junit.Assert.*;
import org.junit.Test;
import jfdata.manager.JfdataManager;
import jfdata.model.standing.Standing;
import test.config.ConfigTest;

/**
 * JUnit class test for Standing
 * All Standing methods are tested in this class
 * @author remimarion
 */
public class StandingTest {

	@Test
	public void testGetStanding() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Standing actual = jfdataManager.getStanding(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getStandings());
	}

}
