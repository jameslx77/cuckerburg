package code;

import javax.swing.*;

/**
 * This is the GUI class.
 * 
 * @author James Li-Xu
 * @author Benjamin Shapiro
 */

public class GUI {

	public static void main(String[] args) {

		/**
		 * Simple JFrame Need to Adjust later for devices
		 */

		JFrame frame = new JFrame("Cuckerburg (Name TBD)");
		frame.setSize(1280, 1080);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);

	}

}
