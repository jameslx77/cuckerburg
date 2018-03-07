package code;

import java.awt.*;
import java.awt.event.*;

public class button extends Frame implements WindowListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private int numClicks = 0;
	
	TextField text = new TextField(12);
	TextField text2 = new TextField(12);
	Button b;
	Button c;

	public static void main(String[] args) {
		button myWindow = new button("Cucks");
		myWindow.setSize(200, 100);
		myWindow.setVisible(true);
	}

	public button(String title) {

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
		text2.setText("You got " + numClicks + " votes!");
		text.setText("You got " + numClicks + " votes!");
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
