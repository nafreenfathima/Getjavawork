import java.util.Scanner;

	public class ProductSupplier {

	    public static void main(String[] args) {
			
			Scanner Sc= new Scanner(System.in);
			System.out.println("Enter the product id");
			int pid1= Sc.nextInt();
			System.out.println("Enter the product name");
			String pname1= Sc.next();
			System.out.println("Enter the supplier name");
			String sname1= Sc.next();
			
			Product p1= new Product(pid1,pname1,sname1);
			p1.display();
			
			System.out.println("Enter the product id");
			int pid2= Sc.nextInt();
			System.out.println("Enter the product name");
			String pname2= Sc.next();
			System.out.println("Enter the supplier name");
			String sname2= Sc.next();
			
			Product p2= new Product(pid2,pname2,sname2);
			p2.display();
			
			if(p1.equals(p2))
			{
				System.out.println("The two products are the same");
			}
			else
			{
				System.out.println("The two products are different");
			}

		}

	}

