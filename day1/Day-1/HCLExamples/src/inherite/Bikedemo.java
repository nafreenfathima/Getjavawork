package inherite;

public class Bikedemo {
	public static void main(String[] args)
	{
		Bike b=new Bike();
	boolean isBikeselfdriven =b.selfdriven();
	if(isBikeselfdriven)
	{
		System.out.println("Bike driven itself,just we have to balance");
		
	}
		b.balance();
	}

}
