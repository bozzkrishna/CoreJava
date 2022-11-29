
public class ForLoopRevPatt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r=5;
		for(int i=r; i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=r; i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		for(int i=r; i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		for(int i=r; i>=1;i--)
		{
			int m=1;
			for(int j=i;j>=1;j--)
			{
				System.out.print(m);
				m++;
			}
			System.out.println();
		}
		System.out.println();

	}

}
