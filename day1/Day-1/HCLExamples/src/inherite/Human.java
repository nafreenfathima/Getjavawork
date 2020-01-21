package inherite;

public class Human extends Species {
	public static int legs=2;
	private boolean swimmingstatus;
	Human()
	{
		swimmingstatus=false;
		System.out.println("Human constructor");
		
	}
	public void talk()
	{
		System.out.println("can talk");
	}
	public void walk()
	{
		System.out.println("can walk");	
	}
	
	{
	System.out.println("can walk"+"with"+legs+"legs.");
}

	
	}
