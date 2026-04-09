package class_notes;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GameS26 extends GameBase
{	
	
	Soldier s = new Soldier(100, 100, Soldier.LT);
	
	Rect r1 = new Rect(800, 100, 20, 500);
	Rect r2 = new Rect(800, 100, 600, 20);
	Rect r3 = new Rect(20, 100, 800, 20);
	Rect r4 = new Rect(800, 100, 20, 800);
	
	
	public void inGameLoop()
	{
		// Move User Controlled Objects
		if(pressing[UP])   s.goUP(6);
		if(pressing[DN])   s.goDN(6);
		if(pressing[LT])   s.goLT(6);
		if(pressing[RT])   s.goRT(6);

		s.move();
		

		
		// Move Computer Controlled Objects

		
		// Handle Collisions
		
		if(r1.overlaps(s))  r1.pushes(s);
		if(r2.overlaps(s))  r2.pushes(s);
		if(r3.overlaps(s))  r3.pushes(s);
		
		// Update the Screen
	}
	
	
	
	public void paint(Graphics g)
	{	
		g.setColor(Color.BLACK);
		
		s.draw(g);
		
		
		r1.draw(g);
		r2.draw(g);
		r3.draw(g);
		//r4.draw(g);
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