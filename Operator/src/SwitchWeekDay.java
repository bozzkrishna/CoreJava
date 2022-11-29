import java.util.Scanner;

public class SwitchWeekDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		d=sc.nextInt();

		switch(d)
		{
		case 1:
			System.out.println("Sun");
			break;
			
		case 2:
			System.out.println("Mon");
			break;
			
		case 3:
			System.out.println("Tue");
			break;
			
		case 9%5:
			System.out.println("Wed");
			break;
			
		case 4+1:
			System.out.println("Thu");
			break;
			
		case 7-1:
			System.out.println("Fri");
			break;
			
		case 16/2:
			System.out.println("Sat");
			break;
			
		default:
			System.out.println("Invalid Number");
		}
	}

}
