package constructor;

public class Palintrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0,r,num=1234321;
		int tem=num;
		while(0<num)
		{
			r=num%10;
			a=(a*10)+r;
			num=num/10;
		}
		if(tem==a)
		{
			System.out.println(a+"Palintrome");
		}
		else
		{
			System.out.println(a+"Not Palintrome");
		}
	}

}
