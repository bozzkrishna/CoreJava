package JavaCore;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int j,k,cnt=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Start Value:");
	j=sc.nextInt();
	System.out.println("Ent Value:");
	k=sc.nextInt();
	
	do
	{
		if(j%2==0)
		{
			System.out.println(j)
;
			cnt++;
			}
		j++;
	}while(j<=k);
	System.out.println("Tatol Even No :"+cnt);
	}

}
