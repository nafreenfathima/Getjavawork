package polymorphism;

public class Flightdemo {
	public static void main(String[] args) {
		
		//creating object for Flight class
		Flight f=new Flight();
		
		
		//set the values to flight class attributes or properties or class instance variable
	
		f.flightNumber="AI304";
		//f.tails=1;
		f.setWheels(16);
		f.setAirLines("Air India");
				
		//calling methods of Flight class
		f.fly();
		
		
	}
	
	
	

}
