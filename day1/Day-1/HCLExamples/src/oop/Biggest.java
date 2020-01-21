package oop;
import java.util.Scanner;
public class Biggest {
	public static void main(String[] args) {
	int a,b,c;
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the first number:");
	a=s.nextInt();
	System.out.print("Enter the second number:");
	b=s.nextInt();
	System.out.print("Enter the third number");
	c=s.nextInt();
	if(a > b && a > c) {
	
	System.out.print("  biggest number is:"+a);
	}
	else if(b > c && a > b) {
		System.out.print(" biggest number is:"+b);
	}
	else
	{
		System.out.print("biggest number is:"+c);
	}
	
	}
}
