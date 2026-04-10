package class_notes;

public class BadSoldier extends Soldier
{
	public BadSoldier(int x, int y, int direction)
	{
		super(x, y, direction);
	}
	
	public void chase(Rect s)
	{
		if(y > s.y + 50)  moveUP(3);
		if(y < s.y - 50)  moveDN(3);
		if(x > s.x + 25)  moveLT(3);
		if(x < s.x - 25)  moveRT(3);		
	}

	
	public void evade(Rect s)
	{
		if(y > s.y + 50)  moveDN(3);
		if(y < s.y - 50)  moveUP(3);
		if(x > s.x + 25)  moveRT(3);
		if(x < s.x - 25)  moveLT(3);		
	}

}