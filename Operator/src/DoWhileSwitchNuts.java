import java.util.Scanner;

public class DoWhileSwitchNuts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q,r,total;
		char ch='n';
		do
		{
			System.out.println("1.Cashew Rs.680/kg \n2.Pista Rs.700/kg \n3.Almond Rs.650/kg \n4.Walnut Rs.900/kg");
			System.out.println("Enter Your Order :");
			Scanner sc=new Scanner(System.in);
			r=sc.nextInt();
			System.out.println("Quatity :");
			q=sc.nextInt();
			
			switch(r)
			{
			case 1:
				System.out.println("Total :"+(680*q));
				break;
			case 2:
				System.out.println("Total :"+(700*q));
				break;
			case 3:
				System.out.println("Total :"+(650*q));
				break;
			case 4:
				System.out.println("Total :"+(900*q));
				break;
			
			}
			
			System.out.println("Do u want to Continue (y/n):");
			ch=sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');

	}

}
