package myio;
import java.util.Scanner;
import static java.lang.System.out;
import java.text.DecimalFormat;
public class Polydemo {
	Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
	
		int x=0,y=0;
		float a=0,b=0;
		double result;
		int choice=0;
		//create object to show decimal places
		DecimalFormat df=new DecimalFormat("##.00");
	
		out.println("1.Add two integers\n2.Add two real numbers\n3.exit");
		out.println("Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) 
		{
		case 1 : result=add(x,y);
		break;
		case 2 : result=add(a,b);
		break;
		case 3 : break;
		}
		//end of switch block
	//print result
	System.out.println("Result:"+df.format(result));
	}//end of main method
	public static int add(int x,int y)
	{
		out.println("Enter first integer:");
		x=sc.nextInt();
		out.println("Enter second integer:");
		y=sc.nextInt();
		return x+y;
	}
	public static float add(float a,float b)
	{
		out.println("Enter first real number:");
		a=sc.nextFloat();
		out.println("Enter second real number:");
		b=sc.nextFloat();
		return a+b;
	}
}
		
	
		
		
		
		
		


