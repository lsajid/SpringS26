package class_notes;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
//import java.util.Scanner;
// swang fx -> lightweight
// awt 

public class GameS26 extends Applet implements Runnable, KeyListener, MouseListener, MouseMotionListener
{	
	Rect[] r = new Rect[10];
	
	boolean start = false;
	
	Rect r1 = new Rect(100, 100, 500, 500);
	Rect r2 = new Rect(300, 200, 100, 60);
	Rect r3 = new Rect(700, 400, 30, 100);
	
	Rect dragRect = new Rect(-1000, 0, 0, 0);
	
	int mx;
	int my;
	
	Thread t;
	
	boolean pressed_UP = false;
	boolean pressed_DN = false;
	boolean pressed_LT = false;
	boolean pressed_RT = false;
	
	public void init()
	{ 
		for (int i = 0; i < r.length; i++) {
			r[i] = new Rect(1 * 30, 100, 20, 4);
		}
		
		requestFocus();
		addKeyListener(this);
		addMouseListener(this);
		addMouseMotionListener(this);
		t = new Thread(this);
		t.start();
	}
		
	public void keyPressed(KeyEvent e)
	{	
		int code = e.getKeyCode();
		if(code == e.VK_UP) 		pressed_UP = true;
		if(code == e.VK_DOWN) 		pressed_DN = true;
		if(code == e.VK_LEFT)		pressed_LT = true; 
		if(code == e.VK_RIGHT)		pressed_RT = true;
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		int code = e.getKeyCode();
		if(code == e.VK_UP) 		pressed_UP = false;
		if(code == e.VK_DOWN) 		pressed_DN = false;
		if(code == e.VK_LEFT)		pressed_LT = false; 
		if(code == e.VK_RIGHT)		pressed_RT = false;
	}
	
	public void keyTyped(KeyEvent e) {}
	
	public void paint(Graphics g) 
	{
		for(int i = 0; i < r.length; i++) 
		{
			r[i].draw(g);
		}
	}
	
	public void run()
	{
		while(true)
		{	
			// Code that executes 60 times per second
			
			
			//move user controlled objects
			for(int i = 0; i < r.length; i++) {
				if(r[i].selected) {					
					if(pressed_UP) r[i].moveBy(0, -5);
					if(pressed_DN) r[i].moveBy(0, 5);
					if(pressed_LT) r[i].moveBy(-5, 0);
					if(pressed_RT) r[i].moveBy(5, 0);
				}
			}
			
			//	operating system updates the screen as the lowest priority

			//de morgans law
			
			
			repaint(); // repaint tells the operating system that you would like the screen to be repainted

			try {
				//why is the thread sleep again?				
				Thread.sleep(16);
			}
			catch (InterruptedException e) {}
		}
	}
	
	public void drawVLine(Graphics g, int y1, int y2, int x)
	{
		if (y1 > y2)
		{
			int temp 	= y1;
			y1 			= y2;
			y2			= temp;	
		}
		
		for (int y = y1; y <= y2; y++)
		{
			drawPoint(g, x, y);
		}
	}
	
	public void drawHLine(Graphics g, int x1, int x2, int y) 
	{
		if (x1 > x2)
		{
			int temp 	= x1;
			x1 			= x2;
			x2			= temp;		
		}
		
		for(int x = x1; x <= x2; x++)
		{
			drawPoint(g, x, y);
		}
	}

	public void drawPoint(Graphics g, int x, int y) 
	{
		g.drawLine(x, y, x, y);
	}
	
	@Override
	public void mouseMoved(MouseEvent e) 
	{
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) 
	{
		int nx = e.getX();
		int ny = e.getY();
		
		int w = nx - mx;
		int h = ny - my;
		
		for(int i = 0; i < r.length; i++) {
			r[i].clearSelected();
			if(dragRect.overlaps(r[i])) r[i].setSelected();
		}
	}

	/*
	 * this version allows you to pick one
	 * of the rectangles by pressing the mouse button
	 * while the mouse is inside the rectangle
	 */
	@Override
	public void mousePressed(MouseEvent e) 
	{
		int mx = e.getX();
		int my = e.getY();
		
		for (int i = 0; i < r.length; i++) {
			if(r[i].contains(mx, my)) {
				my_r = r[i];
			}
		}
	}
	
	/*
	 * This version allows you to pick one of the rectangles by pressing the mouse button 
	 * while the mouse is inside the rectangle
	 * 
	 * 
	 */
	
	
	@Override
	public void mouseReleased(MouseEvent e) 
	{
		dragRect = new Rect(-1000, 0, 0, 0);
		
		System.out.println("mouse released");
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	// figure out how to draw slopes line as homework
	
	
}
