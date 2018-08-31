package test.competition;

import static org.junit.Assert.*;

import org.junit.Test;

import jfdata.manager.JfdataManager;
import jfdata.model.competition.CompetitionListModel;
import jfdata.model.competition.CompetitionModel;
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
		CompetitionListModel actual = jfdataManager.getAllCompetitions();
		
		assertNotNull(actual);
		
		for (CompetitionModel competitionModel : actual.getCompetitions()) {
			assertNotNull(competitionModel.getId());
		}
	}

	@Test
	public void testGetCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		CompetitionModel actual = jfdataManager.getCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getId());
	}
}
