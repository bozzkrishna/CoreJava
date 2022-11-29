
public class PatternNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,r=6;
		for(i=1; i<=r; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(j+" ");
			}
				for(k=i-1; k>=1; k--)
				{
					System.out.print(k+" ");
				}
			
			System.out.println();
		}
		

	}

}
