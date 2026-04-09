package class_notes;
import java.awt.*;

public class Background 
{
	Image image;
	
	int w;
	int h;
	
	public Background(String filename, int w, int h) 
	{
		image = Toolkit.getDefaultToolkit().getImage(filename);
		
		this.w = w;
		this.h = h;
	}
	
	public void draw(Graphics g) 
	{
		g.drawImage(image, 0, 0, w, h, null);
	}
	
	// display the trees with respect to the camera's...
	
	
}
