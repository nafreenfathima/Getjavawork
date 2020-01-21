import java.util.Scanner;
public class Wrraperoop {
	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
	
		 System.out.println("Enter the binary number");
		 String s1=sc.next();
		 System.out.println("Enter the octal number");
		 String s2=sc.next();
		 System.out.println("Enter the hexadecimal number");
		 String s3=sc.next();
	
		 System.out.println("The integer value of the binary number "+s1+" is " +Integer.parseInt(s1,2));	
		 System.out.println("The integer value of the octal number "+s2+" is " +Integer.parseInt(s2,8));	
		 System.out.println("The integer value of the hexadecimal number "+s3+ " is " + Integer.parseInt(s3,16));	
				
	
	}
	}
