package main;

import javax.swing.JFrame;

public class GameWindow {

	private JFrame jframe;   // Defines an object that can be used later. It starts empty (defaults to null)

	//Constructor//
	public GameWindow(GamePanel gamePanel) {

		jframe = new JFrame();    //<--Creates the object defined above (they're connected)

		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.add(gamePanel);
		jframe.setLocationRelativeTo(null);
		jframe.setResizable(false);
		jframe.pack();
		jframe.setVisible(true);
	}
}
