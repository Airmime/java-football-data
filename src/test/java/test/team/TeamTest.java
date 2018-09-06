package test.team;

import static org.junit.Assert.*;

import org.junit.Test;
import jfdata.manager.JfdataManager;
import jfdata.model.team.TeamList;
import jfdata.model.team.Team;
import test.config.ConfigTest;

/**
 * JUnit class test for Team
 * All Team methods are tested in this class
 * @author remimarion
 */
public class TeamTest {

	@Test
	public void testGetTeamsByCompetition() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		TeamList actual = jfdataManager.getTeamsByCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getTeams());
	}
	
	@Test
	public void testGetTeam() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		Team actual = jfdataManager.getTeam(18);
		
		assertNotNull(actual);
		assertNotNull(actual.getName());
	}
}
