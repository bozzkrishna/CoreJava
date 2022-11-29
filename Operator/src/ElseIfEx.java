import java.util.Scanner;

public class ElseIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m;
		System.out.println("Enter the Mark :\t");
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		if(m>75 && m<100)
		{
			System.out.println("Distinction");	
		}
		else if(m>60)
		{
			System.out.println("First Class");
		}
		else if(m>55)
		{
			System.out.println("Second Class");
		}
		else if(m>50)
		{
			System.out.println("3rd Class");
		}
		else if(m>35)
		{
			System.out.println("Pass");
		}
		else if(m<35)
		{
			System.out.println("Fail");
		}

	}

}
