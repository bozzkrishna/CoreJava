package Pattern;

import java.util.Scanner;
public class MirrorDownwardTriangle
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
 
    System.out.println("Enter the number of rows: "); //takes input from user
 
    int rows = sc.nextInt();
 
    
    for (int i= rows; i>=1; i--)
    {
    for (int j=rows; j>i; j--)
    {
    	System.out.print(" ");
    }
    for (int k=1; k<=i; k++)
    {
    System.out.print("*" + " ");
    }
    System.out.println("");
    }

    }
    }