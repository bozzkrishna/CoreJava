package day3;

public class Area {
	
	float  cArea,r;
	int rArea,sArea,l,h,a;
	

	public void AreaCal(double d)
	{
		System.out.println(" Area of Circle :"+(3.14*d*d));
	}
	public int AreaCal (int l, int h)
	{
		return l*h;
	}
	public void AreaCal (int a)
	{
		System.out.println("Area of Square :"+(a*a));
	}
}
