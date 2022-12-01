package Pattern;
import java.util.Scanner;  
public class AlphabetPattern  
{  
public static void main(String[] args)  
{  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Row :");
	int n=sc.nextInt();
int i, j;  
// Outer for loop for number of lines  
for (i = 0; i<=n; i++)   
{  
// Inner for loop for logic execution  
for (j = 0; j<= n / 2; j++)   
{  
// prints two vertical lines  
if ((j == 0 || j == n / 2) && i != 0 ||  
// print first line of alphabet  
i == 0  && j != n / 2 ||   
// prints middle line  
i == n / 2)   
System.out.print("*");  
else  
System.out.print(" ");  
}  
System.out.println();  
}  
}  
}  