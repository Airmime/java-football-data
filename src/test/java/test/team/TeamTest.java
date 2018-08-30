package test.team;

import static org.junit.Assert.*;

import org.junit.Test;
import jfdata.manager.JfdataManager;
import jfdata.model.team.TeamListModel;
import jfdata.model.team.TeamModel;
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
		TeamListModel actual = jfdataManager.GetTeamsByCompetition(2015);
		
		assertNotNull(actual);
		assertNotNull(actual.getTeams());
	}
	
	@Test
	public void testGetTeam() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		TeamModel actual = jfdataManager.GetTeam(18);
		
		assertNotNull(actual);
		assertNotNull(actual.getName());
	}
}
