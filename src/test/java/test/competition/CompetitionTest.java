package test.competition;

import static org.junit.Assert.*;

import org.junit.Test;

import jfdata.manager.JfdataManager;
import jfdata.model.competition.CompetitionList;
import jfdata.model.competition.Competition;
import test.config.ConfigTest;

/**
 * JUnit class test for Competition
 * All Competition methods are tested in this class
 * @author remimarion
 */
public class CompetitionTest {

	@Test
	public void testGetAllCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		CompetitionList actual = jfdataManager.getAllCompetitions();
		
		assertNotNull(actual);
		
		for (Competition competitionModel : actual.getCompetitions()) {
			assertNotNull(competitionModel.getId());
		}
	}

	@Test
	public void testGetCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Competition actual = jfdataManager.getCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getId());
	}
}
