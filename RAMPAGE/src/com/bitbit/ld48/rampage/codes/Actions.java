package com.bitbit.ld48.rampage.codes;

import java.util.Random;

public class Actions {

	static Random attackdmggen = new Random();
	static int dmg;
	
	public static void run()
	{
		SlideHandler.slider.start();
	}
	
	public static void punch()
	{
		
		boolean alreadykilled = false;
		
		Main.energy -= 7;
		if(Main.offsetarray[1] > 500 && !alreadykilled && Main.healtharray[1] > 0)
		{
			dmg = (attackdmggen.nextInt(5)) + 5;
			Main.healtharray[1] -= dmg;
			Main.health -= Main.attackarray[1];
			if(Main.healtharray[1] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
				if(Main.peoplearray[1] == 13)
				{
					Main.health += 57;
				}
				
				if(Main.peoplearray[1] == 0)
				{
					Main.health += 10;
				}
				
			}
		}
		
		if(Main.offsetarray[2] > 500 && !alreadykilled && Main.healtharray[2] > 0)
		{
			dmg = (attackdmggen.nextInt(5)) + 5;
			Main.healtharray[2] -= dmg;
			Main.health -= Main.attackarray[2];
			if(Main.healtharray[2] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				System.out.println(Main.kills);
				alreadykilled = true;
				
				if(Main.peoplearray[1] == 13)
				{
					Main.health += 57;
				}
				
				if(Main.peoplearray[1] == 0)
				{
					Main.health += 10;
				}
				
			}
		}
		
		if(Main.offsetarray[3] > 500 && !alreadykilled && Main.healtharray[3] > 0)
		{
			dmg = (attackdmggen.nextInt(5)) + 5;
			Main.healtharray[3] -= dmg;
			Main.health -= Main.attackarray[3];
			if(Main.healtharray[3] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
				if(Main.peoplearray[1] == 13)
				{
					Main.health += 57;
				}
				
				if(Main.peoplearray[1] == 0)
				{
					Main.health += 10;
				}
				
			}
		}
		
		if(Main.offsetarray[4] > 500 && !alreadykilled && Main.healtharray[4] > 0)
		{
			dmg = (attackdmggen.nextInt(5)) + 5;
			Main.healtharray[4] -= dmg;
			Main.health -= Main.attackarray[4];
			if(Main.healtharray[4] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
				if(Main.peoplearray[1] == 13)
				{
					Main.health += 57;
				}
				
				if(Main.peoplearray[1] == 0)
				{
					Main.health += 10;
				}
				
			}
		}
		
	}
	
	public static void fire()
	{
		
		boolean alreadykilled = false;
		
		Main.energy -= 5;
		if(Main.offsetarray[1] > 500 && !alreadykilled && Main.healtharray[1] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[1] -= dmg;
			Main.health -= Main.attackarray[1];
			if(Main.healtharray[1] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
			}
		}
		
		if(Main.offsetarray[2] > 500 && !alreadykilled && Main.healtharray[2] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[2] -= dmg;
			Main.health -= Main.attackarray[2];
			if(Main.healtharray[2] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
			}
		}
		
		if(Main.offsetarray[3] > 500 && !alreadykilled && Main.healtharray[3] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[3] -= dmg;
			Main.health -= Main.attackarray[3];
			if(Main.healtharray[3] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
			}
		}
		
		if(Main.offsetarray[4] > 500 && !alreadykilled && Main.healtharray[4] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[4] -= dmg;
			Main.health -= Main.attackarray[4];
			if(Main.healtharray[4] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
			}
		}
	}
	
	public static void kick()
	{
		boolean alreadykilled = false;
		
		Main.energy -= 13;
		if(Main.offsetarray[1] > 500 && !alreadykilled && Main.healtharray[1] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[1] -= dmg;
			Main.health -= Main.attackarray[1];
			if(Main.healtharray[1] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
			}
		}
		
		if(Main.offsetarray[2] > 500 && !alreadykilled && Main.healtharray[2] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[2] -= dmg;
			Main.health -= Main.attackarray[2];
			if(Main.healtharray[2] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
			}
		}
		
		if(Main.offsetarray[3] > 500 && !alreadykilled && Main.healtharray[3] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[3] -= dmg;
			Main.health -= Main.attackarray[3];
			if(Main.healtharray[3] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
			}
		}
		
		if(Main.offsetarray[4] > 500 && !alreadykilled && Main.healtharray[4] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[4] -= dmg;
			Main.health -= Main.attackarray[4];
			if(Main.healtharray[4] <= 0)
			{
				
				Main.kills++;
				Main.rampage++;
				alreadykilled = true;
				
			}
		}
	}
	
	public static void block()
	{
		if(Main.energy >= 14)
		{
			Main.energy -= 14;
			if(Main.health < 300)
			{
				Main.health += 3;
			}
			if(Main.health > 300)
			{
				Main.health = 300;
			}
		}
	}
	
	public static void firerampage()
	{
		boolean alreadykilled = false;
		
		Main.rampage = 0;
		
		if(Main.offsetarray[1] > 500 && !alreadykilled && Main.healtharray[1] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[1] -= dmg;
			Main.health -= Main.attackarray[1];
			if(Main.healtharray[1] <= 0)
			{
				
				Main.kills++;
				
			}
		}
		
		if(Main.offsetarray[2] > 500 && !alreadykilled && Main.healtharray[2] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[2] -= dmg;
			Main.health -= Main.attackarray[2];
			if(Main.healtharray[2] <= 0)
			{
				
				Main.kills++;
				
			}
		}
		
		if(Main.offsetarray[3] > 500 && !alreadykilled && Main.healtharray[3] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[3] -= dmg;
			Main.health -= Main.attackarray[3];
			if(Main.healtharray[3] <= 0)
			{
				
				Main.kills++;
				
			}
		}
		
		if(Main.offsetarray[4] > 500 && !alreadykilled && Main.healtharray[4] > 0)
		{
			dmg = (attackdmggen.nextInt(14)) + 3;
			Main.healtharray[4] -= dmg;
			Main.health -= Main.attackarray[4];
			if(Main.healtharray[4] <= 0)
			{
				
				Main.kills++;
				
			}
		}
	}
	
	public static void smash()
	{
		
		boolean alreadykilled = false;
		
		Main.rampage = 0;

			dmg = (attackdmggen.nextInt(6)) + 27;
			Main.healtharray[1] -= dmg;
			Main.health -= Main.attackarray[1];
			if(Main.healtharray[1] <= 0)
			{
				
				Main.kills++;
				
			}

			dmg = (attackdmggen.nextInt(6)) + 27;
			Main.healtharray[2] -= dmg;
			Main.health -= Main.attackarray[2];
			if(Main.healtharray[2] <= 0)
			{
				
				Main.kills++;
				
			}

			dmg = (attackdmggen.nextInt(6)) + 27;
			Main.healtharray[3] -= dmg;
			Main.health -= Main.attackarray[3];
			if(Main.healtharray[3] <= 0)
			{
				
				Main.kills++;
				
			}
		
			dmg = (attackdmggen.nextInt(6)) + 27;
			Main.healtharray[4] -= dmg;
			Main.health -= Main.attackarray[4];
			if(Main.healtharray[4] <= 0)
			{
				
				Main.kills++;
				
			}
	}
	
	public static void wave()
	{
		boolean alreadykilled = false;
		
		Main.rampage = 0;

			dmg = (attackdmggen.nextInt(2)) + 1;
			Main.healtharray[1] -= dmg;
			Main.health -= Main.attackarray[1];
			if(Main.healtharray[1] <= 0)
			{
				
				Main.kills++;
				
			}

			dmg = (attackdmggen.nextInt(2)) + 1;
			Main.healtharray[2] -= dmg;
			Main.health -= Main.attackarray[2];
			if(Main.healtharray[2] <= 0)
			{
				
				Main.kills++;
				
			}

			dmg = (attackdmggen.nextInt(2)) + 1;
			Main.healtharray[3] -= dmg;
			Main.health -= Main.attackarray[3];
			if(Main.healtharray[3] <= 0)
			{
				
				Main.kills++;
				
			}
		
			dmg = (attackdmggen.nextInt(2)) + 1;
			Main.healtharray[4] -= dmg;
			Main.health -= Main.attackarray[4];
			if(Main.healtharray[4] <= 0)
			{
				
				Main.kills++;
				
			}
	}
	
	public static void deathbolt()
	{
boolean alreadykilled = false;
		
		Main.rampage = 0;

			dmg = (attackdmggen.nextInt(7)) + 2;
			Main.healtharray[1] -= dmg;
			Main.health -= Main.attackarray[1];
			if(Main.healtharray[1] <= 0)
			{
				
				Main.health += dmg;
				Main.kills++;
				
			}

			Main.healtharray[2] -= dmg;
			Main.health -= Main.attackarray[2];
			if(Main.healtharray[2] <= 0)
			{
				
				Main.health += dmg;
				Main.kills++;
				
			}

			Main.healtharray[3] -= dmg;
			Main.health -= Main.attackarray[3];
			if(Main.healtharray[3] <= 0)
			{
				
				Main.health += dmg;
				Main.kills++;
				
			}
		
			Main.healtharray[4] -= dmg;
			Main.health -= Main.attackarray[4];
			if(Main.healtharray[4] <= 0)
			{
				
				Main.health += dmg;
				Main.kills++;
				
			}
			
			if(Main.health >= 300)
			{
				Main.health = 300;
			}
			
	}
	
	public static void die()
	{
		Main.dead = true;
		
	}
	
}
