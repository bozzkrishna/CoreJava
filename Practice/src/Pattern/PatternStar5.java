package Pattern;

public class PatternStar5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l,m,n,r=5;
		for(i=1; i<=r; i++)
		{
			for(j=r-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for(k=1; k<=i; k++)
			{
			System.out.print("*");	
			}
			System.out.println();
		}
		
		for(l=1; l<=r-1; l++)
		{
			for(m=1; m<=l; m++)
			{
				System.out.print(" ");
			}
			for(n=r-l; n>=1; n--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
