package ClassObjectEncapsulation;

public class Semester  {
	
	int regno,phy,mat,che,total;
	float percentage;
	String name;
	void acceptDetails(String n,int rn,int p, int m, int c)
	{
		name=n;
		regno=rn;
		phy=p;
		mat=m;
		che=c;
	}
	void showDetails()
	{
		

	
	System.out.println("Name :"+ name);
		System.out.println("Reg No :" + regno);
		System.out.println("Marks :"+ phy +" "+ mat +" "+ che);
		System.out.println("Total :"+ (phy+mat+che));
		System.out.println("Over All Percentage :"+ ((phy+mat+che)/3)+"%");
		System.out.println("");
		System.out.println(); 
 	}
	

	

}
