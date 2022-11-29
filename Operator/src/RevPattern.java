
public class RevPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,r=6;
		for(i=1;i<=r;i++)
		{
			for(k=1;k<=r-i;k++)
			{
				System.out.print(" ");
			}
			char ch='a';
			for(j=1; j<=i; j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
