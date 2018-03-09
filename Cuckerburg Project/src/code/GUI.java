package code;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * This is the GUI class.
 * 
 * @author James Li-Xu
 * @author Benjamin Shapiro
 */

public class GUI extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 600;
	private static final int HEIGHT = 400;
	private JFrame frame;
	private JButton voteLeft;
	private JButton voteRight;
	private int numClickLeft = 0;
	private int numClickRight = 0;

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
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.getHSBColor((float) 0.6,(float) 0.6,(float) .8));
		frame.add(panel);

		voteLeft = new JButton("Vote for the left");
		voteRight = new JButton("Vote for the right");
		voteLeft.setBounds(60, 100, 40, 20);
		voteRight.setBounds(60, 100, 40, 20);
		voteLeft.setVisible(true);
		voteRight.setVisible(true);
		final TextField prompt=new TextField(30);
		panel.add(prompt);
		prompt.setEditable(false);
		final TextField left = new TextField(12);
		final TextField right = new TextField(12);
		panel.add(left);
		panel.add(right);
		left.setEditable(false);
		right.setEditable(false);
		

		voteLeft.addActionListener(this);
		voteRight.addActionListener(this);
		voteRight.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == voteRight) {
					numClickRight += 1;
					right.setText("You got " + numClickRight + " votes!");
				}
			}

		});

		voteLeft.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (e.getSource() == voteLeft) {
					numClickLeft += 1;
					left.setText("You got " + numClickLeft + " votes!");
				}
			}

		});

		panel.add(voteLeft);
		panel.add(voteRight);
	}
	

	public void actionPerformed(ActionEvent e) {

	}

	public GUI() {
		gui();
	}

	public static void main(String[] args) {

		new GUI();

	}
}
