import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add");
		System.out.println("2.Sub");
		System.out.println("3.Mul");
		System.out.println("4.Div");
		System.out.println("Enter your Choice :");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Two Num");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Add :"+(a+b));
			break;
		case 2:
			System.out.println("Enter Two Num");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Sub :"+(a-b));
			break;
		case 3:
			System.out.println("Enter Two Num");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Mul :"+(a*b));
			break;
		case 4:
			System.out.println("Enter Two Num");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Div :"+(a/b));
			break;
			
			
		}

	}

}
