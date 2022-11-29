import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev = 0;
		char ch='n';
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter the number :");
			num=sc.nextInt();
			while(num>0)
			{
				int r=num%10;
				rev=rev*10+r;
				num=num/10;
			}
			System.out.println("Reverse :"+rev);
			System.out.println("Do U want to con...(y/n):");
			ch=sc.next().charAt(0);
		} while(ch=='y' || ch=='Y');
		
		
		
		

	}

}
