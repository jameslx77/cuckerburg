package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import code.Game;

/**
 * This is the JUnit test case class.
 * 
 * @author James Li-Xu
 * @author Benjamin Shapiro
 * 
 */

public class GameTests {

	@Test
	public void testGetPrompts() {
		Game game = new Game();
		game.readTextFile();
		assertTrue(game.getListOfPrompts().size() != 0);
		assertTrue(game.getListOfPrompts().size() >= 1);
	}

	@Test
	public void testGetRandomPrompts() {
		Game random = new Game();
		random.readTextFile();
		random.getRandomPrompt();
		for (int x = 0; x < random.getListOfPrompts().size(); x++) {
			for (int i = x + 1; i < random.getListOfPrompts().size(); i++) {
				if (random.getListOfPrompts().get(x) == random.getListOfPrompts().get(i)) {
					assertFalse(false);
				}
			}
		}
	}
}
