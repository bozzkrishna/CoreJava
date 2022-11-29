package ass1;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,y,w;
		System.out.println("Enter the Days");
		Scanner sc=new Scanner(System.in);
		d=sc.nextInt();
		y=d/365;
		w=(d%365)/7;
		d=(d%365)%7;
		System.out.println(y+"Years"+w+"Weeks"+d+"Days");

	}

}
