package class_notes;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
//00:52:01

public class GameS26 extends GameBase
{		
	
	Soldier s = new Soldier(100, 100, Soldier.LT);
	Rect r = new Rect(800, 100, 20, 300);
	
	public void inGameLoop()
	{
			// Code that executes 60 times per second
			
			// Move User Controlled Objects
			if(pressing[UP])   s.moveUP(6);
			if(pressing[DN])   s.moveDN(6);
			if(pressing[LT])   s.moveLT(6);
			if(pressing[RT])   s.moveRT(6);

			
			// Move Computer Controlled Objects

			
			// Handle Collisions
			if(s.overlaps(r)) s.x -= (s.x +s.w -r.x);
			
			
			// Update the Screen

	}
	
	
	public void paint(Graphics g)
	{	
		s.draw(g);
		r.draw(g);		
		
	}
	
	public void mouseDragged(MouseEvent e)
	{
		int nx = e.getX();
		int ny = e.getY();
		
		int w = nx - mx;
		int h = ny - my;
		
	}
	
	public void mousePressed(MouseEvent e)
	{
		mx = e.getX();
		my = e.getY();
	}
	
}
