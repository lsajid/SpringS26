package class_notes;

import java.awt.*;
import java.awt.Toolkit;

public class Billboard
{
	double x;
	double y;
	double z;
	
	int w;
	int h;
		
	Image image;
	
	final int d = 256;

	public Billboard(String filename, int x, int y, int z, int w, int h)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		
		this.w = w;
		this.h = h;
		
		image = Toolkit.getDefaultToolkit().getImage(filename);
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(image, (int)(d*x/z)+800, (int)(d*y/z)+450, (int)(d*w/z), (int)(d*h/z), null);
	}

	


}