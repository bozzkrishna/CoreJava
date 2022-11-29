import java.util.Scanner;

public class FindUpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		char ch='n';
		
		do
		{
			System.out.println("Enter the Key :");
			Scanner sc=new Scanner(System.in);
			i=sc.next().charAt(0);
		if(i>=97 && i<=123)
		{
			System.out.println("Lower Case");
		}
		else if (65>=2 && i<=96)
		{
			System.out.println("Upper Case");
		}
		else if (48>=0 && i<=57)
		{
			System.out.println("Digit");
		}
		System.out.println("Continue (y/n):");
		ch =sc.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		

	}

}
