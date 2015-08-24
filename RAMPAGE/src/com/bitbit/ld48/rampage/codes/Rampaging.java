package com.bitbit.ld48.rampage.codes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;


public class Rampaging implements ActionListener
{
	
	public static boolean rampaging = false;
	
	static int timerupct = 0;
	
	static Timer timer;
	
	public static void rampage(Rampaging handleclass)
	{
		timer = new Timer(1400, handleclass);
		timer.start();
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(timerupct == 3 && Main.selectedmonster == 1 || Main.selectedmonster == 5)
		{
			rampaging = false;
			Main.rampage = 0;
			timer.stop();
			timerupct = 0;
		}
		
		if(timerupct == 2 && Main.selectedmonster == 2)
		{
			Actions.smash();
			rampaging = false;
			Main.rampage = 0;
			timer.stop();
			timerupct = 0;
		}
		
		if(timerupct == 1 && Main.selectedmonster == 3)
		{
			rampaging = false;
			timer.stop();
			timerupct = 0;
		}
		
		timerupct++;
		System.out.println(timerupct);
	}
	
}
