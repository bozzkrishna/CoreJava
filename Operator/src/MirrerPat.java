import java.util.Scanner;

public class MirrerPat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,r,k;
		System.out.println("Enter the Row:");
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		for(i=0; i<=r; i++)
		{
			for(j=r-i; j>=1; j--)
			{
				System.out.print(" ");
			}
				
				for(j=0;j<=i; j++)
				{
					System.out.print(j+" ");
				
				}
				
			
			System.out.println();
		}
		int space = 1;  
		for (j = 1; j<= r - 1; j++)  
		{  
		for (i = 1; i<= space; i++)  
		{  
		System.out.print(" ");  
		}  
		space++;  
		for (i = 1; i<= 2 * (r - j) - 1; i++)  
		{  
		System.out.print(i+" ");  
		}  
		System.out.println("");  
		

	}
	}

}
