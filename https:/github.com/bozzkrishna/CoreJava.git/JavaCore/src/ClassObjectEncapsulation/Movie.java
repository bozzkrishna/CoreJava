package ClassObjectEncapsulation;

public class Movie {
	
	int year;
	float profite;
	void acceptDetails(int y, float p )
	{
		year=y;
		profite=p;
	}
	void showDetails()
	{
	
		System.out.println("Launched Year :" + year);
		System.out.println("Over All Profite :"+ profite);
		System.out.println("");
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie titanic=new Movie();
		titanic.acceptDetails(1977, 50000);
		titanic.showDetails();
		
		Movie KGF=new Movie();
		KGF.acceptDetails(2022, 90000);
		KGF.showDetails();
	}

}
