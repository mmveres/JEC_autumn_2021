package ua.univer.mvc3.com.javaextetnal_shulzhenko.gaming.GuessTheNumber;

/**
 * Executive GuessTheNumberMVC class
 *
 * @version 0.2 13 Feb 2020
 * @author Adnrii Shulzhenko
 */
public class GuessTheNumberMVC {

	public static void main(String[] args) {

		Model gameModel = new Model();
		View gameView = new View();
		Controller game = new Controller(gameModel, gameView);
		game.launchGame();
	}
}
