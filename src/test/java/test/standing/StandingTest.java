package test.standing;

import static org.junit.Assert.*;
import org.junit.Test;
import jfdata.manager.JfdataManager;
import jfdata.model.standing.StandingModel;
import test.config.ConfigTest;

public class StandingTest {

	@Test
	public void testGetStanding() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN, ConfigTest.TYPE);
		StandingModel actual = jfdataManager.getStanding(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getStandings());
	}

}
