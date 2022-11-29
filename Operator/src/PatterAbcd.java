
public class PatterAbcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i,j;
		char x=96;
		for(i=1; i<=4;i++)
		{
			for(j=1; j<=i;j++)
			{
				System.out.print( (j+x));
				x++;
			}
			System.out.println();
		}

	}

}
