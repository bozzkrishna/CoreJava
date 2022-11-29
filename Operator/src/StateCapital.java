import java.util.Scanner;

public class StateCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the State :");
		s=sc.next();
		if(s.equals("MH"))
		{
			System.out.println("Mumbai");
		}
		else if(s.equals("TN"))
		{
			System.out.println("Chennai");
		}
		else if(s.equals("KL"))
		{
			System.out.println("Thiruvanandhapuram");
		}
		else
		{
			System.out.println("Invalid");
		}

	}

}
