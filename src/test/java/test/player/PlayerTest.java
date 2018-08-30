package test.player;

import static org.junit.Assert.*;
import org.junit.Test;
import jfdata.manager.JfdataManager;
import jfdata.model.player.PlayerModel;
import test.config.ConfigTest;

public class PlayerTest {

	@Test
	public void testGetPlayer() {
		JfdataManager jfdataManager = new JfdataManager(ConfigTest.TOKEN);
		PlayerModel actual = jfdataManager.GetPlayer(44);
		
		assertNotNull(actual);
		assertNotNull(actual.getName());
	}
}
