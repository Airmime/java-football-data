package test.match;

import static org.junit.Assert.*;
import org.junit.Test;
import jfdata.manager.JfdataManager;
import jfdata.model.match.MatchListModel;
import jfdata.model.match.MatchModel;
import test.config.ConfigTest;

public class MatchTest {

	@Test
	public void testGetMatch() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN, ConfigTest.TYPE);
		MatchModel actual = jfdataManager.getMatch(238997);
		
		assertNotNull(actual);
		assertNotNull(actual.getScore());
		assertNotNull(actual.getScore().getWinner());
	}
	
	@Test
	public void testGetMatchByCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN, ConfigTest.TYPE);
		MatchListModel actual = jfdataManager.getMatchByCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getMatches());
	}
	
	@Test
	public void testGetMatchByTeam() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN, ConfigTest.TYPE);
		MatchListModel actual = jfdataManager.getMatchByTeam(527);
		
		assertNotNull(actual);
		assertNotNull(actual.getMatches());
	}
}
