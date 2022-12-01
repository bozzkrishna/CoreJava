package constructor;

public class SumOf3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		for(int i=1; i<1000; i++)
		{
			if(i%3==0 && i%5==0)
			{
				a+=i;
				System.out.print(a+ " ");
			}
		}
		System.out.println(a);
	}

}
