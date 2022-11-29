import java.util.Scanner;

public class WhileEvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,e;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Start and End Value :");
		n=sc.nextInt();
		e=sc.nextInt();
		for(i=1; i<=e; i++)
		{
			while(i%2==0)
			{
				System.out.println(i);
				i++;
			}
		}

	}

}
