import java.util.Scanner;
public class EmailIdoop2 {

	    public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter First Customer Details :");
			System.out.println("Enter Customer Name :");
			String cname1=sc.next();
			System.out.println("Enter Customer Email :");
			String cmail1=sc.next();
			
			System.out.println("Enter Second Customer Details :");
			System.out.println("Enter Customer Name :");
			String cname2=sc.next();
			System.out.println("Enter Customer Email :");
			String cmail2=sc.next();
			
			Customer c1= new Customer(cname1,cmail1);
			Customer c2= new Customer(cname2,cmail2);
			
			if(c1.equals(c2))
			{
				System.out.println("The Email ids of "+cname1+" and "+cname2+" are equal");
			}
			else
			{
				System.out.println("The Email ids of "+cname1+" and "+cname2+" are not equal");
			}
			
			System.out.println("Comparing without considering the cases :");
			
			if(c1.equalsIgnoreCase(c2))
			{
				System.out.println("The Email ids of "+cname1+" and "+cname2+" are Equal");
			}
			else
			{
				System.out.println("The Email ids of "+cname1+" and "+cname2+" are not Equal");
			}

		}

}
