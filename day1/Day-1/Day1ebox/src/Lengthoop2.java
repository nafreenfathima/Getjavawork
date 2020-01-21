import java.util.Scanner;

	public class Lengthoop2 {

	    public static void main(String[] args) {
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter address:");
			String s= sc.nextLine();
			
			String a0= s.substring(0,20);
			String a1= s.substring(20,44);
			String a2= s.substring(44,57);
			String a3= s.substring(57,68);
			String a4= s.substring(68,71);
			String a5= s.substring(71,77);
			String a6= s.substring(77,79);
			String a7= s.substring(79,84);
			
			String line1=a0;
			String line2=a1;
			String line3=a3;
			String city=a4;
			String state=a6;
			String country=a7;
			String otherDetails=a2;
			int zipCode=Integer.parseInt(a5);
			
			System.out.println("Address : ");
			Address ob= new Address(line1,line2,line3,city,state,country,
					otherDetails,zipCode) ;
			System.out.println(ob);

		}

	}

