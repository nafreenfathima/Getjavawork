package oop;

	import static java.lang.System.out;

	import java.util.Scanner;

	public class FixedAccount 
	{

		public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);
		out.println("Enter Account No: ");
		long fixedaccno = sc.nextLong();
		out.println("Account no :" +fixedaccno);
		}
	}

