package class_notes;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GameS26 extends GameBase
{	
	
	Soldier s = new Soldier(800, 0, Soldier.LT);
	
	
	int[] x = 
	{
			3, 
			5, 
			62, 
			23, 
			3, 
			65
	};
	
	Rect[] platform = 
	{
		new Rect(0, 860, 1200, 40),
		new Rect(1250, 700, 1600, 40),
		new Rect(100, 200, 200, 140),		
		new Rect(1200, 200, 200, 140),		
		new Rect(400, 325, 550, 50),		
	};
	
	int v = 6;
	
	String[] map = 
	{
		"...ABC................ABC",
		".........................",
		".........................",
		".........................",
		".........................",
		"......NOOOOOOOOP.........",
		".........................",
		".........................",
		".........................",
		".........................",
		".........................",
		".........................",
		"QQQQQQQQQQQQQQQQQQQQQQQQQ",
		"RRRRRRRRRRRRRRRRRRRRRRRRR",
	};
	
	
	TileMap tileMap = new TileMap("");
	
	public void inGameLoop()
	{	
	    s.physics = true;
			
			// Move User Controlled Objects
		if(pressing[UP])   s.jump();
		if(pressing[DN])   s.goDN(v);
		if(pressing[LT])   s.goLT(v);
		if(pressing[RT])   s.goRT(v);

		s.move();
		
			

			
			// Move Computer Controlled Objects

			
			// Handle Collisions
			
		
		for(int i = 0; i < platform.length; i++)
		{
			if(s.overlaps(platform[i]))
			{
				platform[i].pushes(s);
				
				s.vx = 0;
				s.vy = 0;
			}
		}
		
			//if(r2.overlaps(s))  r2.pushes(s);
			//if(r3.overlaps(s))  r3.pushes(s);
			
			// Update the Screen
	}
	
	
	
	public void paint(Graphics g)
	{	
		s.draw(g);
		
		for(int i = 0; i < platform.length; i++)
		{
			//platform[i].draw(g);
		}
		
		tileMap.draw(g);
	}
	
	
}



/*

//Move User Controlled Objects
if(pressing[UP])
{
	s.moveUP(6);
	
	if(s.overlaps(r1))   r1.pushDown(s);
}

if(pressing[DN])
{
	s.moveDN(6);

	if(s.overlaps(r1))   r1.pushUp(s);;
}

if(pressing[LT])
{
	s.moveLT(6);

	if(s.overlaps(r1))   r1.pushRight(s);;
}

if(pressing[RT])
{
	s.moveRT(6);

	if(s.overlaps(r1))   r1.pushLeft(s);;
}


*/