package Inheritance;

public class Address {
//	area,city,state,pincode;
	private int pincode;
	private String area,city,state;
	
	public void setArea(String area)
	{
		this.area=area;
	}
	public String getArea()
	{
		return area;
	}
	public void setCity(String city)
	{
		this.city=city;
	}
	public String getCity()
	{
		return city;
	}
	public void setState(String state)
	{
		this.state=state;
	}
	public String getState()
	{
		return state;
	}
	public void setPincode(int pincode)
	{
		this.pincode=pincode;
	}
	public int getPincode()
	{
		return pincode;
	}
	
//	public String toString()
//	{
//		return "\nArea :"+area+"\nCity :"+city+"\nState :"+state+"\nPincode :"+pincode;
//	}

}
