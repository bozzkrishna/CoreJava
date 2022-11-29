import java.util.Scanner;

public class VowelsConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char h;
		System.out.println("Enter the Char :");
		Scanner sc=new Scanner(System.in);
		h=sc.next().charAt(0);
		if(h=='A' || h=='a')
		{
			System.out.println("Vowel");
		}
		else if(h=='e' || h=='E')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}

}
