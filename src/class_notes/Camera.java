package class_notes;

public class Camera {
	static int x;
	static int y;
	
	public Camera(int x, int y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public static void moveLeft(int dx) 
	{
		x -= dx;
	}
	
	public static void moveRight(int dx) 
	{
		x += dx;
	}
	
	public static void moveUp(int dy) 
	{
		x -= dy;
	}
	
	public static void moveDown(int dy) 
	{
		x += dy;
	}
	
}
