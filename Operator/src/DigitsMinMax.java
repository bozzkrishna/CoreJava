import java.util.Scanner;

public class DigitsMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		System.out.println("Enter the number :");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int max=num%10;
		int min=num%10;
		while(num!=0)
		{
			int r=num%10;
			if(r>max)
			{
				max=r;
			}
			if(r<min)
			{
				min=r;
			}
			num=num/10;
		}
		System.out.println("Minmum :"+min);
		System.out.println("Maximum :"+max);

	}

}
