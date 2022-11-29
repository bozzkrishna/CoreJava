import java.util.Scanner;

public class RevPatABCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j,ch='a';
		System.out.println("Enter the Char :");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		for(i=ch; i>='a';i--)
		{
			char m=ch;
			for(j=i; j>='a'; j--)
			{
				System.out.print(m);
				m--;
			}
			System.out.println();
		}
		System.out.println();
		for(i=ch; i>='a';i--)
		{
			for(j=i; j>='a'; j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(i=ch; i>='a';i--)
		{
			for(j=i; j>='a'; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();

	}

}
