package code;

import java.awt.*;
import java.awt.event.*;

public class GameButton extends Frame implements WindowListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private int numClicks = 0;
	private int numClicks2=0;
	
	TextField text = new TextField(12);
	TextField text2 = new TextField(12);
	Button b;
	Button c;

	public static void main(String[] args) {
		GameButton myWindow = new GameButton("Cucks");
		myWindow.setSize(200, 100);
		myWindow.setVisible(true);
	}

	public GameButton(String title) {

		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		b = new Button("Votes");
		c = new Button("Votes");
		add(c);
		add(text2);
		add(b);
		add(text);
		b.addActionListener(this);
		c.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		numClicks++;
		
		text.setText("You got " + numClicks + " votes!");
	}
	public void buttontwo(ActionEvent oe){
		numClicks++;
		text2.setText("You got " + numClicks + " votes!");
	}

	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}

}
