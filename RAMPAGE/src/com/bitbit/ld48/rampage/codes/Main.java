package com.bitbit.ld48.rampage.codes;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {

	static JFrame frame;
	static JFrame introframe;
	
	public static int level = 0;
	public static int distance = 0;
	
	public static int health = 300;
	public static int energy = 100;	
	public static int rampage = 0;
	
	public static int[] peoplearray = new int[5];
	public static int[] healtharray = new int[5];
	public static int[] attackarray = new int[5];
	public static int[] offsetarray = new int[5];
	public static int[] defaultoffsets = new int[5];
	
	public static Timer timer;
	public static int speed = 230;
	public static int pause = 0;
	
	public static boolean firstdraw = true;	
	
	public static int kills = 0;
	
	public static int selectedmonster = 0;
	
	public static boolean dead = false;
	
	static BufferedImage icon;
	
	static ImageIcon img;
	
	public static void main(String args[])
	{
		
		img = new ImageIcon("res/icon.png");
		
		initIntro();
		
		defaultoffsets[0] = 0;
		defaultoffsets[1] = -30;
		defaultoffsets[2] = -57;
		
		offsetarray = defaultoffsets;
		
	}
	
	static void initIntro()
	{
		introframe = new JFrame("RAMPAGE");
		introframe.setBounds(60, 60, 600, 448);
		introframe.setVisible(true);
		introframe.setResizable(false);
		introframe.add(new IntroSurface());
		introframe.addKeyListener(new IntroListener());
		introframe.setIconImage(img.getImage());
		introframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	static void initFrame()
	{
		frame = new JFrame("RAMPAGE");
		frame.setBounds(60, 60, 600, 448);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(new GraphicSurface());
		frame.addKeyListener(new KeyInput());
		frame.setIconImage(img.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	static void generateNext4People()
	{
		int armychance = 0;
		int civchance = 0;
		
		civchance = (int) (5000 - distance) / 2;
		armychance = ((int) distance / 2) + 17;
		
		if(distance < 200)
		{
			armychance = 0;
		}
		
		Random typegen = new Random();
		Random persongen = new Random();
		
		Random healthattack = new Random();
		
		for(int i = 0; i <= 4; i++)
		{
			int finalgen = persongen.nextInt(civchance + armychance);
			
			if(finalgen > civchance)
			{
				//army
				int type = typegen.nextInt(4);
				if(type == 2)
				{
					//car
					int cartype = typegen.nextInt(4);
					if(cartype != 1)
					{
						peoplearray[i] = 9;
						healtharray[i] = healthattack.nextInt(20) + 87;
						attackarray[i] = healthattack.nextInt(5) + 6;
					}
					else
					{
						peoplearray[i] = 13;
						healtharray[i] = healthattack.nextInt(20) + 50;
						attackarray[i] = healthattack.nextInt(5);
					}
				}
				else
				{
					//person
					int ptype = typegen.nextInt(4);
					peoplearray[i] = ptype + 5;
					healtharray[i] = healthattack.nextInt(4) + 28;
					attackarray[i] = healthattack.nextInt(3) + 2;
				}
			}
			else
			{
				//civ
				int type = typegen.nextInt(4);
				if(type == 2)
				{
					//car
					int ctype = typegen.nextInt(4);
					peoplearray[i] = ctype + 9;
					healtharray[i] = healthattack.nextInt(4) + 28;
					attackarray[i] = 0;
				}
				else
				{
					//person
					int ptype = typegen.nextInt(6);
					peoplearray[i] = ptype;
					healtharray[i] = healthattack.nextInt(4) + 9;
					attackarray[i] = healthattack.nextInt(6);
				}
			}
			
		}
		
		Main.offsetarray[1] = 0;
		Main.offsetarray[2] = -20;
		Main.offsetarray[3] = -40;
		Main.offsetarray[4] = -60;
		
	}
	
}
