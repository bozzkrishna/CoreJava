package JavaCore;

import java.util.Scanner;
public class Vowel {

    public static void main(String[] args) {
   
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Char :");
    	char ch =sc.next().charAt(0);
    	
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }
}