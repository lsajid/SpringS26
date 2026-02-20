package class_notes;
import java.awt.*;

public class Rect 
{
	int x;
	int y;
	
	int w;
	int h;
	
	boolean selected = false;
	
	public Rect(int x, int y, int w, int h)
	{
		this.x = x;
		this.y = y;
		
		this.w = w;
		this.h = h;
	}
	
	
	public boolean overlaps(Rect r)
	{
		return 	(x 	<= r.x 	+ r.w) &&
				(y 	<= r.y 	+ r.h) &&
				
				(r.x <= x + w) &&
				(r.y <= y + h);
	}
	
	public boolean isSelected() {
		return selected;
	}
	
	public void setSelected() {
		selected = true;
	}
	
	public void clearSelected() {
		selected = false;
	}
	
	
	public void toggle() {
		selected = !selected;	
	}
	
	public void draw(Graphics g, int item) 
	{
		drawHLine(g, x, x+w, y);
		drawHLine(g, x, x+w, y+h);
		drawHLine(g, x, y, y+h);
		drawHLine(g, x+w, y, y+h);
	}
	
	public void draw(Graphics g) 
	{
		g.drawRect(x, y, w, h);
	}
	
	public void moveBy(int dx, int dy) 
	{
		x += dx;
		y += dy;
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
	
	public void drawPoint(Graphics g, int x, int y) 
	{
		g.drawLine(x, y, x, y);
	}
}
