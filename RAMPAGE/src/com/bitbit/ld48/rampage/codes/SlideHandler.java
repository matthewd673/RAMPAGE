package com.bitbit.ld48.rampage.codes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class SlideHandler implements ActionListener {

	public static int slidespeed = 10;
	public static Timer slider;
	
	
	public static void initSlider(SlideHandler handleclass)
	{
		slider = new Timer(slidespeed, handleclass);
		
		slider.start();
	}

	public void actionPerformed(ActionEvent e) 
	{
		
		/*
		if(Main.offsetarray[0] < 523)
		{
			Main.offsetarray[0]++;
			if(Main.offsetarray[1] < 523)
			{
				Main.offsetarray[1]++;
				if(Main.offsetarray[2] < 523)
				{
					Main.offsetarray[2]++;
				}
				else
				{
					GraphicSurface.stopped = true;
				}
			}
			else
			{
				GraphicSurface.stopped = true;
			}
		}
		else
		{
			GraphicSurface.stopped = true;
		}
		*/
		
		for(int i = 0; i <= 4; i++)
		{
			if(Main.offsetarray[i] < 523)
			{
				Main.offsetarray[i]++;
			}
		}
		
		if(Main.healtharray[1] <= 0 && Main.healtharray[2] <= 0 && Main.healtharray[3] <= 0 && Main.healtharray[4] <= 0)
		{
			Main.generateNext4People();
		}
		
	}
	
}
