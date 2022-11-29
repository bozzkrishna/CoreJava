import java.util.Scanner;

public class DoWhileSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,choice;
		char ch='n';
		do
		{
			System.out.println("Enter the a and b value :");
			Scanner sc=new Scanner(System.in);
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("1.Add \n2.Sub \n3.Mul \n4.Div");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println(a+b);
				break;
			case 2:
				System.out.println(a-b);
				break;
			case 3:
				System.out.println(a*b);
				break;
			case 4:
				System.out.println(a/b);
				break;
			default :
				System.out.println("invalid..");
			}
			System.out.println("Do U Want Continue (y/n) :");
			ch=sc.next().charAt(0);
			
		}while(ch=='y' || ch=='Y');

	}

}
