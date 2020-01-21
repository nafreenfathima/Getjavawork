

	import java.util.Scanner;
	public class Swapping
	{
	    public static void main(String args[])
	    {
	        int x, y;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter two integers:");
	        x= scanner.nextInt();
	       
	        y= scanner.nextInt();
	        System.out.println("Pre swapping");
	        System.out.println(x+" "+y);
	        x = x ^ y;
	       
	        y = x ^ y;
	       
	        x = x ^ y;
	       
	        System.out.println("After swapping:"+x+" " +y);
	      
	    }
	}

