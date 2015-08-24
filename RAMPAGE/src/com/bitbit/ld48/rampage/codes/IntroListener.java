package com.bitbit.ld48.rampage.codes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;

public class IntroListener implements KeyListener {

	public void keyPressed(KeyEvent e) 
	{
		
		switch(e.getKeyCode())
		{
		
		case KeyEvent.VK_A:
			Main.selectedmonster = 1;
			Main.initFrame();
			break;
			
		case KeyEvent.VK_S:
			Main.selectedmonster = 2;
			Main.initFrame();
			break;
			
		case KeyEvent.VK_D:
			Main.selectedmonster = 3;
			Main.initFrame();
			break;
			
		case KeyEvent.VK_F:
			Main.selectedmonster = 4;
			Main.initFrame();
			break;
			
		case KeyEvent.VK_G:
			Main.selectedmonster = 5;
			Main.initFrame();
			break;
		
		}
		
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		
	}

}
