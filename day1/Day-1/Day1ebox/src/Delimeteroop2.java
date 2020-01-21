import java.util.Scanner;

	public class Delimeteroop2 {

	    public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter address seperated by commas (xyz,abc):");
			String s= sc.nextLine();
			
			String a[]= s.split(",");
			
			String line1=a[0];
			String line2=a[1];
			String line3=a[3];
			String city=a[4];
			String state=a[6];
			String country=a[7];
			String otherDetails=a[2];
			int zipCode=Integer.parseInt(a[5]);
			
			System.out.println("Address : ");
			Address3 ob= new Address3(line1,line2,line3,city,state,country,
					otherDetails,zipCode) ;
			System.out.println(ob);

		}

}
