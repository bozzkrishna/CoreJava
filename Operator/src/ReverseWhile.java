import java.util.Scanner;

public class ReverseWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rev=0;
		System.out.println("Enter the Number :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num!=0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
			
			
		}
		System.out.println("Reverse :"+ rev);

	}

}
