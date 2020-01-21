package polymorphism;

public  class Flight extends Bird2 implements inherite.Automobile{
	private int wheels;
	public String flightNumber;
	private String airLines;
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirLines() {
		return airLines;
	}
	public void setAirLines(String airLines) {
		this.airLines = airLines;
	}
	@Override
	public boolean selfdriven() {
		// TODO Auto-generated method stub
		return true;
	}
	//method overriding
	@Override
	public void fly() {
		
		//we can call super class fly method also by using super keyword
		//super.fly();
		System.out.println("Flight"+this.flightNumber+"belongs to"+this.airLines+"starting..."+"has"+this.tails+"tail decorted with red color");
		
		System.out.println("Start first Engine");
		System.out.println("Drive The flight towards runway");
	     System.out.println("Once Flight reaches the runway");
	     System.out.println("start second Engine");
	     
	     System.out.println("Take off");
	     
}
	
	
	}
