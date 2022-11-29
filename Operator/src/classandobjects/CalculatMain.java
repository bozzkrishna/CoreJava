package classandobjects;

import java.util.Scanner;

public class CalculatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calcu obj1=new Calcu();
		System.out.println("Enter Opt : \n1.add \n2.sub \n3.mul \n4.div");
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
			obj1.add();
			break;
		case 2:
			obj1.sub();
			break;
		case 3:
			obj1.mul();
		case 4:
			obj1.div();
			break;
			
			
		}
		
	}

}
