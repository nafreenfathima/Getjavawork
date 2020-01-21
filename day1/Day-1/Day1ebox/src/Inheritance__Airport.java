import java.util.Scanner;
	public class Inheritance__Airport {
	 public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  CommercialServiceAirport csa=new CommercialServiceAirport();
	  CargoServiceAirport casa=new CargoServiceAirport();
	  System.out.println("Enter the name");
	  String name=sc.nextLine();
	  System.out.println("Enter the city");
	  String city=sc.nextLine();
	  System.out.println("Enter the number of flights per day");
	  int num=sc.nextInt();
	  System.out.println("Enter the number of passengers travelling in each flight");
	  int numpass=sc.nextInt();
	  System.out.println("Enter the number of cargo units shipped in each flight");
	  int numcar=sc.nextInt();
	  System.out.println("Airport Details\r\n" + "Number of passengers travelled/day:"+csa.calculatenoOfPassengers(num, numpass));
	  System.out.println("Number of cargo units shipped/day:"+casa.calculatenoOfCargounits(num, numcar));  
	 }
	}

