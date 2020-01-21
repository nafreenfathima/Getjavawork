import java.util.Scanner;

	public class EmailIDComparison {

	    public static void main(String[] args) {
			
			Scanner g= new Scanner(System.in);
			
			System.out.println("Enter First Customer Details :");
			
			System.out.println("Enter Customer Name :");
			String cname1= g.next();
			
			System.out.println("Enter Customer Email :");
			String cemail1= g.next();
			
	        System.out.println("Enter Second Customer Details :");
			
			System.out.println("Enter Customer Name :");
			String cname2= g.next();
			
			System.out.println("Enter Customer Email :");
			String cemail2= g.next();
			
			Customer3 c1= new Customer3(cname1,cemail1);
			Customer3 c2= new Customer3(cname2,cemail2);
			
			if(cemail1==cemail2)
			{
				System.out.println("The Email ids of "+cname1+" and "+cname2+" are equal");
			}
			else
			{
				System.out.println("The Email ids of "+cname1+" and "+cname2+" are not equal");
			}
			
			System.out.println("After duplicating First customer :");
			
			if(cemail1.equals(cemail2))
			{
				System.out.println("The reference of first and new customer Email ids are Equal");
			}
			else
			{
				System.out.println("The reference of first and new customer Email ids are not Equal");
			}

		}

	}

