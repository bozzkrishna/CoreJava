import java.util.Scanner;

public class SwitchMonthDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		System.out.println("Enter the Month Number :");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		switch(m)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
		case 11:
			System.out.println("31 Days");
			break;
			
		
		case 4:
		case 6:
		case 8:
		case 10:
		case 12:
			System.out.println("30 Days");
			break;
			
		case 2:
			System.out.println("28 Days");
			break;
			
		default :
			System.out.println("Invalid Number");
		}

	}

}
