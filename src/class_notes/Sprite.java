package class_notes;
import java.awt.Graphics;


public class Sprite extends Rect
{
	String name;
	
	boolean moving = false;
	
	Animation[] animation = new Animation[4];
	
	boolean selected = false;
	
	boolean physics = false;
	
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
	
	public void goUP(int dy)
	{
		vy = dy;
		
		direction = UP;
		
		moving = true;
	}
	
	public void goDN(int dy)
	{
		y = dy;

		direction = DN;

		moving = true;
	}
	
	public void goLT(int dx)
	{
		vx = dx;

		direction = LT;
		
		moving = true;
	}
	
	public void goRT(int dx)
	{
		vx = dx;
		
		direction = RT;

		moving = true;

	}
	
	public void move() 
	{
		x += vx;
		y += vy;
		
		if(physics == false)
		{
			vx = 0;
			vy = 0;			
		}
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
