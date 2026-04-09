package class_notes;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//1:13:10

public class GameS26 extends GameBase
{		
	
	Soldier s = new Soldier(100, 100, Soldier.LT);
	
	Rect r1 = new Rect(800, 100, 20, 300);
	Rect r2 = new Rect(800, 100, 600, 300);
	Rect r3 = new Rect(800, 100, 20, 300);
	
	public void inGameLoop()
	{
			// Code that executes 60 times per second
			s.physics = true;
		
			// Move User Controlled Objects
			if(pressing[UP]) s.goUP(5);	
			if(pressing[DN]) s.goDN(5);
			if(pressing[LT]) s.goLT(5);	
			if(pressing[RT]) s.goRT(5);				
	
			
			s.move();

			
			// Move Computer Controlled Objects
			if(s.overlaps(r1)) r1.pushes(s);
			if(s.overlaps(r2)) r2.pushes(s);
			if(s.overlaps(r3)) r3.pushes(s);
			
			// Handle Collisions
			
			
			
			// Update the Screen
			
	}
	
	
	public void paint(Graphics g)
	{	
		s.draw(g);
		r1.draw(g);		
		r2.draw(g);
		r3.draw(g);
	}
	
	
}
