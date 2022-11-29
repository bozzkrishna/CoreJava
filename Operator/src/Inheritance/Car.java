package Inheritance;

public class Car {
	private int model,speed;
	private String col;
	Engine e;
	public void setEng(Engine e)
	{
		this.e=e;
	}
	public Engine getEng()
	{
		return e;
	}
	public void setModel(int model)
	{
		this.model=model;
	}
	public int getModel()
	{
		return model;
	}
	public void setCol(String col)
	{
		this.col=col;
	}
	public String getCol()
	{
		return col;
	}
//Car(int model, int speed, String col, Engine e )
//	{
//		this.model=model;
//		this.speed=speed;
//		this.col=col;
//		this.e=e;
//		
//	}
	public String toString()
	{
		return "\nModel :"+model+"\nSpeed :"+speed+"\nCol :"+col+"\nEngine Details ;"+e;
	}

}
