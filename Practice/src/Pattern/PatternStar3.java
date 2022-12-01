package Pattern;

public class PatternStar3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5,i,j,k;
		for(i=1; i<=r; i++)
		{
			for(j=1; j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
for (i=1; i<=r-1; i++) {
		for(k=r-i; k>=1; k--)
		{
			System.out.print("*");
		}
		System.out.println();
}

	
	}

}
