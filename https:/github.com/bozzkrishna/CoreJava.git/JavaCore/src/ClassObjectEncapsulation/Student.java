package ClassObjectEncapsulation;

public class Student {
	
	int regno,phy,mat,com,total;
	float percentage;
	String name;
	void acceptDetails(String n,int rn,int p, int m, int c)
	{
		name=n;
		regno=rn;
		phy=p;
		mat=m;
		com=c;
	}
	void showDetails()
	{
	
		System.out.println("Name :"+ name);
		System.out.println("Reg No :" + regno);
		System.out.println("Marks :"+ phy +" "+ mat +" "+ com);
		System.out.println("Total :"+ (phy+mat+com));
		System.out.println("Over All Percentage :"+ ((phy+mat+com)/3)+"%");
		System.out.println("");
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student krishna=new Student();
		krishna.acceptDetails("Jay", 11001, 88, 99, 77);
		krishna.showDetails();
		
		Student zyan=new Student();
		zyan.acceptDetails("Zyan Malik", 11002, 98, 99, 87);
		zyan.showDetails();
		
		
	}

}
