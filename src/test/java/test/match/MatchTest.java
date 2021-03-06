package test.match;

import static org.junit.Assert.*;
import org.junit.Test;
import jfdata.manager.JfdataManager;
import jfdata.model.match.MatchList;
import jfdata.model.match.Match;
import test.config.ConfigTest;

/**
 * JUnit class test for Match
 * All Match methods are tested in this class
 * @author remimarion
 */
public class MatchTest {

	@Test
	public void testGetMatch() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Match actual = jfdataManager.getMatch(238997);
		
		assertNotNull(actual);
		assertNotNull(actual.getScore());
		assertNotNull(actual.getScore().getWinner());
	}
	
	@Test
	public void testGetMatchByCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		MatchList actual = jfdataManager.getMatchesByCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getMatches());
	}
	
	@Test
	public void testGetMatchByTeam() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		MatchList actual = jfdataManager.getMatchesByTeam(527);
		
		assertNotNull(actual);
		assertNotNull(actual.getMatches());
	}
}
