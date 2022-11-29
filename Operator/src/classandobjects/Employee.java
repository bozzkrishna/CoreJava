package classandobjects;

public class Employee {
	int pf,newsal,hike;

	int  hike(int sal, char rat)
	{
//		if(rat=='a')
//		{
//			hike=(sal/100*20);
//		newsal=sal+hike;
//		System.out.println("Salary is :"+sal);
//		System.out.println("Hike :"+hike);
//		System.out.println("Salary :"+ newsal);
//		}
		
			
		switch(rat)
		{
		case 'a':
			hike=(sal/100*20);
			newsal=sal+hike;
			System.out.println("Salary is :"+sal);
			System.out.println("Hike :"+hike);
			System.out.println("Salary :"+ newsal);
			break;
		case 'b':
			hike=(sal/100*15);
			System.out.println("Salary is :"+sal);
			System.out.println("Hike :"+hike);
			System.out.println("Salary :"+ newsal);
			break;
		case 'c':
			hike=(sal/100*10);
			System.out.println("Salary is :"+sal);
			System.out.println("Hike :"+hike);
			System.out.println("Salary :"+ newsal);
			break;
		case 'd':
			System.out.println("No Hike ");
			System.out.println("Salary:"+sal);
			break;
			
		}
		return newsal;
		
	}
	public void pfcal(int sal)
	{
	pf=(sal/100)*15;
	newsal=newsal-pf;
	System.out.println("PF is :"+pf);
	System.out.println("After Deduction PF :" + newsal);
	
	bonus(sal);
	}
	void bonus(int sal)
	{
		int ebonus=sal*100/25;
		System.out.println("Bonus is:"+ebonus);
	}
	
}
