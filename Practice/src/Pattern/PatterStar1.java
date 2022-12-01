package Pattern;

public class PatterStar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5,i,j,k;
		for(i=1; i<=r; i++)
		{
			for( j =r-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			for ( k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
