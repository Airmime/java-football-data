package test.competition;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import jfdata.manager.JfdataManager;
import jfdata.model.competition.CompetitionModel;
import test.config.ConfigTest;

public class CompetitionTest {

	@Test
	public void testGetAllCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN, ConfigTest.TYPE);
		List<CompetitionModel> actual = jfdataManager.getAllCompetitions().getCompetitions();
		
		assertNotNull(actual);
		
		for (CompetitionModel competitionModel : actual) {
			assertNotNull(competitionModel.getId());
		}
	}

	@Test
	public void testGetCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN, ConfigTest.TYPE);
		CompetitionModel actual = jfdataManager.getCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getId());
	}
}
