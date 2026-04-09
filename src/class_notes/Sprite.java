package class_notes;
import java.awt.Graphics;


public class Sprite extends Rect
{
	String name;
	
	int x;
	int y;
	
	int w;
	int h;
	
	int direction;
	
	boolean moving = false;
	
	
	// Constant values that are used to index the
	// Animation array to select the correct
	// Animation for the direction the solder
	// is moving.
	static final int UP = 0;
	static final int DN = 1;
	static final int LT = 2;
	static final int RT = 3;
	
	
	Animation[] animation = new Animation[4];
	
	boolean selected = false;
	
	public Sprite(String name, int x, int y, int w, int h, int direction, String[] pose)
	{
		super(x, y, w, h);
		this.name = name;
		
		for(int i = 0; i < animation.length; i++)
		{
			animation[i] = new Animation(name + "_" + pose[i], 5, 10, "GIF");
		}
		
		
		this.x = x;
		this.y = y;
		
		this.w = w;
		this.h = h;
		
		this.direction = direction;
	}
	
	public void moveUP(int dy)
	{
		y -= dy;
		
		direction = UP;
		
		moving = true;
	}
	
	public void moveDN(int dy)
	{
		y += dy;

		direction = DN;

		moving = true;
	}
	
	public void moveLT(int dx)
	{
		x -= dx;

		direction = LT;
		
		moving = true;
	}
	
	public void moveRT(int dx)
	{
		x += dx;
		
		direction = RT;

		moving = true;

	}
	
	
	
	public void draw(Graphics g)
	{
		if(moving)
		{
			g.drawImage(animation[direction].nextImage(), x, y, w, h, null);
		}
		else
		{
			g.drawImage(animation[direction].stillImage(), x, y, w, h, null);
		}
		
		
		
		moving = false;
	}
	

}
