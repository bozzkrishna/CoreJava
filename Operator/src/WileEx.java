import java.util.Scanner;

public class WileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start,end;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start and end:");
		start=sc.nextInt();
		end=sc.nextInt();
		while(start<=end)
		{
			if(start%2==0)
			{
				System.out.println(start+"");
			}
			start++;
		}
		System.out.println("Done");

	}

}
