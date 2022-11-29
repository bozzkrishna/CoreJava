import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float avg;
		int s1,s2,s3,s4,s5,total;
		System.out.println("Enter the Marks One by one :");
		Scanner sc=new Scanner(System.in);
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		total=s1+s2+s3+s4+s5;
		avg=(float)total/5;
		System.out.println("Total Marks :\t"+total);
		System.out.println("Average :\t"+avg);
				
	}

}
