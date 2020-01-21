import java.util.Scanner;

	public class AirFareDetails_Inheritance_Additional_main {

	    public static void main(String[] args) {
	    	//Initializing scanner
			Scanner ke= new Scanner(System.in);       
			System.out.println("Enter the source city:");       
			String source= ke.next();
			System.out.println("Enter the destination city:");
			String destination= ke.next();
			//Get flight company from user
			System.out.println("Enter the flight\r\n1.Air India\r\n2.Indigo"); 
			int pq= Integer.parseInt(ke.next());
			double price;
			if(pq==1) 
			{
				AirIndia_Inheritance_Additional ai= new AirIndia_Inheritance_Additional();
				price=ai.showFare(source, destination);
				System.out.println("The fare is "+price);
			}
			else if(pq==2)
			{
				
				
				//Create object for class indigo
				Indigo_Inheritance_Additional in= new Indigo_Inheritance_Additional();
				//Price calculator
				price=in.showFare(source, destination);
				System.out.println("The fare is "+price);
			}
			else
			{
				System.out.println("Invalid Input");
			}
		}

	}

