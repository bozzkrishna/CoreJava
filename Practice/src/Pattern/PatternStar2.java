package Pattern;

public class PatternStar2 {
	public static void main (String[] args){
		int r=4,i,j,k;
		for(i=1; i<=r;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(k=r-i+1; k>=1; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
