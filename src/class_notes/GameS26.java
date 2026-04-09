package class_notes;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//00:55:12

public class GameS26 extends GameBase
{		
	
	Soldier s = new Soldier(100, 100, Soldier.LT);
	
	Rect r1 = new Rect(800, 100, 20, 300);
	Rect r2 = new Rect(800, 100, 600, 300);
	Rect r3 = new Rect(800, 100, 20, 300);
	Rect r4 = new Rect(800, 100, 20, 300);
	
	public void inGameLoop()
	{
			// Code that executes 60 times per second
			
			// Move User Controlled Objects
			if(pressing[UP]) {
				s.moveUP(6);	
				
			}
			if(pressing[DN]) {				
				s.moveDN(6);
				
			}
			if(pressing[LT])
			{
				s.moveLT(6);	
				
			}
			if(pressing[RT])   
			{
				s.moveRT(6);				
				
			}

			
			// Move Computer Controlled Objects
			if(s.overlaps(r1)) r1.pushes(s);
			if(s.overlaps(r1)) r1.pushes(s);
			if(s.overlaps(r1)) r1.pushes(s);
			if(s.overlaps(r1)) r1.pushes(s);
			// Handle Collisions
			
			
			
			// Update the Screen
			
	}
	
	
	public void paint(Graphics g)
	{	
		s.draw(g);
		r1.draw(g);		
//		r2.draw(g);
		//r3.draw(g);
//		r4.draw(g);
	}
	
	
}
