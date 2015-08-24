package com.bitbit.ld48.rampage.codes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {

	public void keyPressed(KeyEvent e) 
	{
		switch(e.getKeyCode())
		{
		
		case KeyEvent.VK_D:
			//punch
			if(Main.energy >= 7)
			{
				GraphicSurface.action = "punch";
			}
			break;
			
		case KeyEvent.VK_W:
			//fire
			if(Main.energy >= 5)
			{
				GraphicSurface.action = "fire";
			}
			break;
			
		case KeyEvent.VK_S:
			//kick
			if(Main.energy >= 5)
			{
				GraphicSurface.action = "kick";
			}
			break;
			
		case KeyEvent.VK_A:
			//block
			GraphicSurface.action = "block";
			break;
		
		}
		
		Main.frame.repaint();
		
	}

	public void keyReleased(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		
		case KeyEvent.VK_W:
			//fire
			GraphicSurface.action = "run";
			break;
			
		case KeyEvent.VK_A:
			//block
			GraphicSurface.action = "run";
		
		}
		
		Main.frame.repaint();
		
	}

	public void keyTyped(KeyEvent e) 
	{
		
	}

}
