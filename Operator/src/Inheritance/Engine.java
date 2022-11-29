package Inheritance;

public class Engine {
	private int power;
	private String com;
	
	public void setPower(int power) {
		this.power=power;
	}
	public int getPower()
	{
		return power;
	}
	public void setCom(String com) {
		this.com=com;
	}
	public String getCom()
	{
		return com;
	}
	
//Engine(int power, String com)
//	{
//		this.com=com;
//		this.power=power;
//	}

	public String toString()
	{
		return "\nCom :"+com+"\nPower :"+power;
	}
}
