package classandobjects;

import java.util.Scanner;

public class AreaOfCir {
	
	float radiusSq(float r)
	{
		float sq = r*r;
		System.out.println("Square :"+sq);
		return sq;
	}
	void area(float sq)
	{
		float area=3.14f*sq;
		System.out.println("Area is :"+area);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		float r=15.5f;
		System.out.println("Enter the R:");
		Scanner sc=new Scanner(System.in);
		float r=sc.nextFloat();
		AreaOfCir obj1=new AreaOfCir();
		float sq=obj1.radiusSq(r);
		obj1.area(sq);

	}

}
