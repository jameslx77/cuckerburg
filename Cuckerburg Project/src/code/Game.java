package code;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This is the main class where all the methods will be.
 * 
 * @author James Li-Xu
 * @author Benjamin Shapiro
 */

public class Game {

	private ArrayList<String> listOfPrompts;
	private ArrayList<String> prompts;

	public Game() {
		this.listOfPrompts = new ArrayList<String>();
		this.prompts = new ArrayList<String>();
	}

	/**
	 * This method will add the prompts.txt to an ArrayList of strings.
	 */

	public void readTextFile() {
		try {
			String filename = "src/code/prompts.txt";
			for (String line : Files.readAllLines(Paths.get(filename))) {
				listOfPrompts.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Loops through the listOfPrompts ArrayList and picks out a random prompt to be
	 * debated.
	 */

	public void getRandomPrompt() {
		Collections.shuffle(listOfPrompts);
		for (int i = 0; i < 2; i++) {
			prompts.add(listOfPrompts.get(i));
		}
	}
	
	
	
	
	
}
