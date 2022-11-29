package classandobjects;

import java.util.Scanner;

public class Bank {
	// funds transfer (ac no, amt,ifsc)
	// balance(ac no)
	// withdraw(ac no,pin)
	//  beneficiary(ac no,bankname,ifsc)
	int tamt=0,wamt=0,balance=50000;
	public void fundTransfer()
	{
		System.out.println(" Enter Ac No, Amount and Ifsc code:");
		Scanner sc=new Scanner(System.in);
		int acno=sc.nextInt();
		int tamt=sc.nextInt();
		int ifsc=sc.nextInt();
		System.out.println("Transfer Succeful :"+(balance-tamt));
		
	}
	public void balance()
	{
		balance=balance-wamt-tamt;
		System.out.println("Balance :"+this.balance);
		
		
	}
	public void withdraw()
	{
		System.out.println("Enter the Ac No and Amount :");
		Scanner sc=new Scanner(System.in);
		wamt=sc.nextInt();
		System.out.println("Withdraw Done :"+"Balance Amount"+(balance-wamt));
		
	}
	public void beneficiary()
	{
		
	}
	

}
