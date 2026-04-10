package class_notes;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class GameS26 extends GameBase
{	
	
	Billboard s1 = new Billboard("g_dn_0.gif", -50, -80, 100, 25, 50);
	Billboard s2 = new Billboard("g_dn_0.gif", -50, -80, 200, 25, 50);
	Billboard s3 = new Billboard("g_dn_0.gif", -50, -80, 300, 25, 50);
	Billboard s4 = new Billboard("g_dn_0.gif", -50, -80, 400, 25, 50);
	
	public void inGameLoop()
	{
		
		
	
			

			
		// Move Computer Controlled Objects
			
		
		
			// Handle Collisions
			
			//if(r1.overlaps(s))  r1.pushes(s);
			//if(r2.overlaps(s))  r2.pushes(s);
			//if(r3.overlaps(s))  r3.pushes(s);
			
			// Update the Screen
	}
	
	
	
	public void paint(Graphics g)
	{	
		s4.draw(g);
		s3.draw(g);
		s2.draw(g);
		s1.draw(g);
		
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