package code;

import java.awt.Dimension;

import javax.swing.*;

/**
 * This is the GUI class.
 * 
 * @author James Li-Xu
 * @author Benjamin Shapiro
 */

public class GUI extends JFrame{

	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	

	/**
	 * Simple JFrame Need to Adjust later for devices
	 */
	
	public void gui() {
		frame = new JFrame("Cuckerburg");
		frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		
		frame.add(new button("Cuck"));
	}

	public GUI() {
		gui();
	}
	
	public static void main(String[] args) {

		new GUI();

	}
}
