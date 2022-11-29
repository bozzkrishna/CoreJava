import java.util.Scanner;

public class MultipleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s,e,r=1;
		System.out.println("Enter the Start and end Value:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextInt();
		e=sc.nextInt();
		while(r<=e)
		{
			System.out.println(r+"*"+s+"\t"+"="+"\t"+s*r);
			r++;
		}

	}

}
