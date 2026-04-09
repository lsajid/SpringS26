package class_notes;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GameS26 extends GameBase
{	
	
	Soldier s = new Soldier(100, 750, Soldier.LT);

	
	ImageLayer mountains 	= new ImageLayer("mountains.gif", 0,0, 500, 1600, 900);
	ImageLayer houses 		= new ImageLayer("houses.gif", 0, 0, 5, 1600, 900);
	ImageLayer trees 		= new ImageLayer("trees.gif", 0, 0, 2, 1600, 900);
	
	public void inGameLoop()
	{
		// Move User Controlled Objects
//		if(pressing[UP])   s.goUP(6);
//		if(pressing[DN])   s.goDN(6);
//		if(pressing[LT])   s.goLT(6);
//		if(pressing[RT])   s.goRT(6);

		if(pressing[UP])
		{
			Camera.moveUp(6);
		}
	
		if(pressing[DN]) 
		{
			Camera.moveDown(6);
		}
		if(pressing[LT])   
		{
			Camera.moveLeft(6);
			s.moveLT(6);
		}
		if(pressing[RT])   
		{
			Camera.moveRight(6);
			s.moveRT(6);
		}
		
		s.move();
		
		// Move Computer Controlled Objects

		
		// Handle Collisions
		
		// Update the Screen
	}
	
	
	
	public void paint(Graphics g)
	{	
		g.setColor(Color.WHITE);
		
		mountains.draw(g);
		houses.draw(g);
		trees.draw(g);
		
		s.draw(g);
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