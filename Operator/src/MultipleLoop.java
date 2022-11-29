import java.util.Scanner;

public class MultipleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,m;
		System.out.println("enter the number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1; i<=10; i++)
		{
		m=n*i;
		System.out.println(m);
		}

	}

}
