package com.bitbit.ld48.rampage.codes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.Timer;

public class GraphicSurface extends JComponent implements ActionListener {

	BufferedImage monster1;
	BufferedImage monster1punch;
	BufferedImage monster1block;
	BufferedImage monster1kick;
	BufferedImage monster1walk1;
	BufferedImage monster1walk2;
	
	BufferedImage civ1;
	BufferedImage civ2;
	BufferedImage civ3;
	BufferedImage civ4;
	BufferedImage civ5;
	BufferedImage nurse;
	BufferedImage car1;
	BufferedImage car2;
	BufferedImage car3;
	BufferedImage ambliance;
	BufferedImage army1;
	BufferedImage army2;
	BufferedImage army3;
	BufferedImage tank;
	BufferedImage bullet;
	BufferedImage missile;
	
	BufferedImage dirttop;
	
	BufferedImage fire;
	BufferedImage rock;
	BufferedImage wave;
	BufferedImage deathbolt;
	
	BufferedImage healthbar;
	BufferedImage healthempty;
	BufferedImage energybar;
	BufferedImage energyempty;
	BufferedImage rampagebar;
	BufferedImage rampageempty;
	
	BufferedImage rampagelogo;
	
	BufferedImage deathscreen;
	
	public static String action = "run";
	
	public static boolean step = true;
	
	public static boolean stopped = false;
	
	public static boolean alreadyhealed = false;
	
	public void paint(Graphics g)
	{
		
		if(Main.firstdraw)
		{
			Main.timer = new Timer(Main.speed, this);
			Main.timer.setInitialDelay(Main.pause);
			Main.timer.start();
			SlideHandler.initSlider(new SlideHandler());
			Main.firstdraw = false;
			Main.generateNext4People();
		}
		
		try {
			dirttop = ImageIO.read(new File("res/dirt-top.png"));
			
			if(Main.selectedmonster == 1)
			{
				monster1 = ImageIO.read(new File("res/monster1-1.png"));
			}
			if(Main.selectedmonster == 2)
			{
				monster1 = ImageIO.read(new File("res/monster2-1.png"));
			}
			
			civ1 = ImageIO.read(new File("res/civ1.png"));
			civ2 = ImageIO.read(new File("res/civ2.png"));
			civ3 = ImageIO.read(new File("res/civ3.png"));
			civ4 = ImageIO.read(new File("res/civ4.png"));
			civ5 = ImageIO.read(new File("res/civ5.png"));
			
			nurse = ImageIO.read(new File("res/nurse.png"));
			
			army1 = ImageIO.read(new File("res/army1.png"));
			army2 = ImageIO.read(new File("res/army2.png"));
			army3 = ImageIO.read(new File("res/army3.png"));
			
			tank = ImageIO.read(new File("res/tank.png"));
			
			ambliance = ImageIO.read(new File("res/ambliance.png"));
			
			car1 = ImageIO.read(new File("res/blue-car.png"));
			car2 = ImageIO.read(new File("res/green-car.png"));
			car3 = ImageIO.read(new File("res/red-car.png"));
			
			if(Main.selectedmonster == 1)
			{
				fire = ImageIO.read(new File("res/fire.png"));
			}
			if(Main.selectedmonster == 2)
			{
				fire = ImageIO.read(new File("res/leaf.png"));
			}
			if(Main.selectedmonster == 3)
			{
				fire = ImageIO.read(new File("res/water.png"));
			}
			if(Main.selectedmonster == 4)
			{
				fire = ImageIO.read(new File("res/electric.png"));
			}
			if(Main.selectedmonster == 5)
			{
				fire = ImageIO.read(new File("res/death.png"));
			}
			
			rock = ImageIO.read(new File("res/rockball.png"));
			wave = ImageIO.read(new File("res/wave.png"));
			deathbolt = ImageIO.read(new File("res/deathbolt.png"));
			
			if(Main.selectedmonster == 1)
			{
				monster1punch = ImageIO.read(new File("res/monster1-punch.png"));
				monster1block = ImageIO.read(new File("res/monster1-block.png"));
				monster1kick = ImageIO.read(new File("res/monster1-kick.png"));
				monster1walk1 = ImageIO.read(new File("res/monster1-2.png"));
				monster1walk2 = ImageIO.read(new File("res/monster1-3.png"));
			}
			
			if(Main.selectedmonster == 2)
			{
				monster1punch = ImageIO.read(new File("res/monster2-punch.png"));
				monster1block = ImageIO.read(new File("res/monster2-block.png"));
				monster1kick = ImageIO.read(new File("res/monster2-kick.png"));
				monster1walk1 = ImageIO.read(new File("res/monster2-2.png"));
				monster1walk2 = ImageIO.read(new File("res/monster2-3.png"));
			}
			
			if(Main.selectedmonster == 3)
			{
				monster1punch = ImageIO.read(new File("res/monster3-punch.png"));
				monster1block = ImageIO.read(new File("res/monster3-block.png"));
				monster1kick = ImageIO.read(new File("res/monster3-kick.png"));
				monster1walk1 = ImageIO.read(new File("res/monster3-2.png"));
				monster1walk2 = ImageIO.read(new File("res/monster3-3.png"));
			}
			if(Main.selectedmonster == 4)
			{
				monster1punch = ImageIO.read(new File("res/monster4-punch.png"));
				monster1block = ImageIO.read(new File("res/monster4-block.png"));
				monster1kick = ImageIO.read(new File("res/monster4-kick.png"));
				monster1walk1 = ImageIO.read(new File("res/monster4-2.png"));
				monster1walk2 = ImageIO.read(new File("res/monster4-3.png"));
			}
			if(Main.selectedmonster == 5)
			{
				monster1punch = ImageIO.read(new File("res/monster5-punch.png"));
				monster1block = ImageIO.read(new File("res/monster5-block.png"));
				monster1kick = ImageIO.read(new File("res/monster5-kick.png"));
				monster1walk1 = ImageIO.read(new File("res/monster5-1.png"));
				monster1walk2 = ImageIO.read(new File("res/monster5-1.png"));
			}
			
			healthbar = ImageIO.read(new File("res/health-bar.png"));
			healthempty = ImageIO.read(new File("res/health-empty.png"));
			energybar = ImageIO.read(new File("res/energy-bar.png"));
			energyempty = ImageIO.read(new File("res/energy-empty.png"));
			rampagebar = ImageIO.read(new File("res/rampage-bar.png"));
			rampageempty = ImageIO.read(new File("res/rampage-empty.png"));
			
			rampagelogo = ImageIO.read(new File("res/rampage-message.png"));
			
			deathscreen = ImageIO.read(new File("res/gameover.png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		g.setColor(new Color(0, 180, 225));
		g.fillRect(0, 0, 1024, 448);
		
		
		
		for(int i = 0; i <= 16; i++)
		{
			g.drawImage(dirttop, i * 64, 384, i * 64 + 64, 432, 0, 0, 24, 24, null);
		}
		
		for(int i = 1; i <= 4; i++)
		{
			
			if(Main.healtharray[i] > 0)
			{
				
				
				switch(Main.peoplearray[i])
				{
				
				case 0:
					g.drawImage(nurse, 600 - Main.offsetarray[i], 320, 36, 64, null);
				
				case 1:
					g.drawImage(civ1, 600 - Main.offsetarray[i], 320, 36, 64, null);
					break;
					
				case 2:
					g.drawImage(civ2, 600 - Main.offsetarray[i], 320, 36, 64, null);
					break;
					
				case 3:
					g.drawImage(civ3, 600 - Main.offsetarray[i], 320, 36, 64, null);
					break;
					
				case 4:
					g.drawImage(civ4, 600 - Main.offsetarray[i], 320, 36, 64, null);
					break;
					
				case 5:
					g.drawImage(civ5, 600 - Main.offsetarray[i], 320, 36, 64, null);
					break;
					
				case 6:
					g.drawImage(army1, 600 - Main.offsetarray[i], 320, 36, 64, null);
					break;
					
				case 7:
					g.drawImage(army2, 600 - Main.offsetarray[i], 320, 36, 64, null);
					break;
					
				case 8:
					g.drawImage(army3, 600 - Main.offsetarray[i], 320, 36, 64, null);
					break;
					
				case 9: 
					//tank
					g.drawImage(tank, 600 - Main.offsetarray[i], 320, 120, 64, null);
					break;
					
				case 10:
					g.drawImage(car1, 600 - Main.offsetarray[i], 320, 112, 64, null);
					break;
					
				case 11:
					g.drawImage(car2, 600 - Main.offsetarray[i], 320, 112, 64, null);
					break;
				
				case 12:
					g.drawImage(car3, 600 - Main.offsetarray[i], 320, 112, 64, null);
					break;
					
				}
			}
			
		}
		
		//check actions
		if(action == "run")
		{
			//do nothing
			if(!stopped)
			{
				if(step)
				{
					g.drawImage(monster1walk1, 24, 256, 60, 128, null);
				}
				else
				{
					g.drawImage(monster1walk2, 24, 256, 60, 128, null);
				}
			}
			else
			{
				g.drawImage(monster1, 24, 256, 60, 128, null);
			}
		}
		if(action == "punch")
		{
			g.drawImage(monster1punch, 24, 256, 60, 128, null);
			//TODO: This
			Actions.punch();
			action = "run";
		}
		if(action == "fire")
		{
			if(!stopped)
			{
				if(step)
				{
					g.drawImage(monster1walk1, 24, 256, 60, 128, null);
				}
				else
				{
					g.drawImage(monster1walk2, 24, 256, 60, 128, null);
				}
			}
			else
			{
				g.drawImage(monster1, 24, 256, 60, 128, null);
			}
			if(Main.energy >= 5)
			{
				g.drawImage(fire, 24, 256, 250, 400, 0, 0, 45, 39, null);
				Actions.fire();
			}
		}
		if(action == "kick")
		{
			g.drawImage(monster1kick, 24, 256, 60, 128, null);
			Actions.kick();
			action = "run";
		}
		if(action == "block")
		{
			g.drawImage(monster1block, 24, 256, 60, 128, null);
			Actions.block();
		}
		
		//draw bars
		g.drawImage(healthempty, 6, 4, 300, 16, null);
		g.drawImage(healthbar, 6, 4, Main.health, 16, null);
		g.drawImage(energyempty, 6, 24, 300, 16, null);
		g.drawImage(energybar, 6, 24, Main.energy * 3, 16, null);
		g.drawImage(rampageempty, 6, 42, 300, 16, null);
		g.drawImage(rampagebar, 6, 42, Main.rampage * 10, 16, null);
		
		if(Main.rampage == 30 && Rampaging.rampaging == false)
		{
			Rampaging.rampaging = true;
			Rampaging.rampage(new Rampaging());
		}
		
		if(Rampaging.rampaging == true)
		{
			switch(Main.selectedmonster)
			{
			
			case 1:
				g.drawImage(fire, 24, 256, 250, 400, 0, 0, 45, 39, null);
				g.drawImage(rampagelogo, 150, 100, 300, 115, null);
				Actions.firerampage();
				break;
				
			case 2:
				g.drawImage(rampagelogo, 150, 100, 300, 115, null);
				g.drawImage(rock, 100, Main.offsetarray[1], 300, 300, null);
				break;
				
			case 3:
				g.drawImage(rampagelogo, 150, 100, 300, 115, null);
				g.drawImage(wave, 0, 348, 600, 100, null);
				if(!alreadyhealed)
				{
					Main.health += 40;
					alreadyhealed = true;
				}
				if(Main.health > 300)
				{
					Main.health = 300;
				}
			
			case 4:
				g.drawImage(fire, 24, 256, 250, 400, 0, 0, 45, 39, null);
				g.drawImage(rampagelogo, 150, 100, 300, 115, null);
				Actions.firerampage();
				break;
				
			case 5:
				g.drawImage(rampagelogo, 150, 100, 300, 115, null);
				g.drawImage(deathbolt, 0, 244, 600, 100, null);
				Actions.deathbolt();
				break;
				
			}
			
		}
		
		if(Rampaging.rampaging == false)
		{
			alreadyhealed = false;
			Actions.run();
		}
		
		if(Main.health <= 0)
		{
			Actions.die();
		}
		
		if(Main.dead)
		{
			g.setFont(new Font("Arial", Font.PLAIN, 36)); 
			g.drawImage(deathscreen, 0, 0, 600, 448, null);
			g.setColor(new Color(0, 179, 206));
			g.drawString(Integer.toString(Main.distance) + " yards", 230, 280);
			g.setColor(new Color(255, 24, 0));
			g.drawString(Integer.toString(Main.kills) + " puny humans", 200, 390);
			
		}
		
	}

	//animator
	public void actionPerformed(ActionEvent e) 
	{
		if(!Main.dead)
		{
			GraphicSurface.step = !GraphicSurface.step;
			Main.frame.repaint();
			if(!stopped)
			{
				Main.distance++;
			}
			
			if(Main.energy < 100)
			{
				Main.energy += 4;
			}
			if(Main.energy > 100)
			{
				Main.energy = 100;
			}
		}
		
	}
	
}
