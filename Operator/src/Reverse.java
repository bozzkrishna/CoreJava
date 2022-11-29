import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end,c;
		System.out.println("Enter the 2 Numbers :");
		Scanner sc=new Scanner(System.in);
		c=sc.nextInt();
		end=sc.nextInt();
		while(end>=c)
		{
			if(end%2!=0)
			{
				System.out.println(end+" ");
			}
			end--;
		}

	}

}
