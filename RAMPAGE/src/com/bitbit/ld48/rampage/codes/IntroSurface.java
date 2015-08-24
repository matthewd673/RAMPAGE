package com.bitbit.ld48.rampage.codes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class IntroSurface extends JComponent {

	BufferedImage logo;
	
	BufferedImage redegg;
	BufferedImage greenegg;
	BufferedImage blueegg;
	BufferedImage yellowegg;
	BufferedImage purpleegg;
	
	public void paint(Graphics g)
	{
		
		try {
			logo = ImageIO.read(new File("res/rampage-logo.png"));
			redegg = ImageIO.read(new File("res/red-egg.png"));
			greenegg = ImageIO.read(new File("res/green-egg.png"));
			blueegg = ImageIO.read(new File("res/blue-egg.png"));
			yellowegg = ImageIO.read(new File("res/yellow-egg.png"));
			purpleegg = ImageIO.read(new File("res/purple-egg.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		g.setColor(new Color(95, 95, 95));
		g.fillRect(0, 0, 800, 800);
		g.drawImage(logo, 24, 24, 560, 100, null);
		
		g.drawImage(redegg, 30, 150, 64, 64, null);
		
		g.drawImage(greenegg, 120, 150, 64, 64, null);
		
		g.drawImage(blueegg, 210, 150, 64, 64, null);
		
		g.drawImage(yellowegg, 300, 150, 64, 64, null);
		
		g.drawImage(purpleegg, 390, 150, 64, 64, null);
		
		g.setColor(new Color(220, 220, 220));
		g.drawString("Select an egg with 'a','s','d','f' or 'g'. INSTRUCTIONS: Beat the townsfolk and army men. WASD to attack.", 4, 300);
		g.drawString("Get 30 kills and you'll 'RAMPAGE'!! Green bar = life, yellow = energy, red = RAMPAGE", 4, 320);
		g.drawString("Heal by blocking (A). Perform your ultimate with W (takes lots of energy). Punch & kick with D and S.", 4, 340);
		g.drawString("LUDUM DARE 33 THEME: You are the monster", 4, 360);
		
	}
	
}
