package JavaCore;

import java.util.Scanner;

public class SumOfDigit 
{  
public static void main(String args[])  
{  
int n, digit, add=0, m, l, sum = 0;  
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ") ;
m = sc.nextInt(); 
n = m ;
l = m;
while(l>0)
{
	l = l/10;
	add++;
}
while(n > 0)  
{  
digit = n % 10;  
// sum = digit*digit*digit;  
sum +=  (Math.pow(digit, add ));
n /=  10; 
}  
System.out.println("Sum of Digits: "+ sum);
if (m == sum)
{

	System.out.println("Given number is Armstrong");
}
else 
{
	System.out.println("Given Number is Not Armstrong");
}
} 
}