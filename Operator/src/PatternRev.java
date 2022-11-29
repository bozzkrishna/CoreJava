import java.util.Scanner;

public class PatternRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		System.out.println("Enter the row :");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		char i,j;
		for(i='a';i<=ch; i++)
		{
			for(j='a'; j<=i; j++)
			{
				if(j%2==0)
				{
					
				}
				else
				System.out.print(j);
			}
			System.out.println("");
		}

	}

}
