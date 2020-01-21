import java.util.Scanner;

	public class RegularExpresstion {

	    public static void main(String[] args) {
			
			Scanner kb= new Scanner(System.in);
			
	        System.out.println("Enter the generated hall booking id to validate:");
	        String h= kb.next();
			int count=0;
			
			for(int i=0;i<h.length();i++)
			{
				if(!h.matches("[0-9]+"))
					count++;
			}
			if(count==0)
			{
				System.out.println("Valid Booking ID");
			}
			else
			{
				System.out.println("Invalid Booking ID");
			}
			
			

		}

	}
		

