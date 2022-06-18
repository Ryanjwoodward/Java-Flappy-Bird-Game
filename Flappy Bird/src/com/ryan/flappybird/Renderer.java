package com.ryan.flappybird;

import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * 
 * @author Ryan Woodward
 *
 */
public class Renderer extends JPanel {

	//**********************************
	//Fields
	//**********************************
	private static final long serialVersionUID = 1L;
	
	//**********************************
	//Misc Methods
	//**********************************
	
	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		FlappyBird.flappyBird.repaint(g);
	}

}//Renderer Class
