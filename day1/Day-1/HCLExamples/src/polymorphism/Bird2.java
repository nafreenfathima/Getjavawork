package polymorphism;

public class Bird2 {
	//instance variables or class variables
	public String birdNmae;
	public StringBuilder birdColor;
	public static int legs=2,wings=2;
	private boolean canSing;
	public int tails=1;
	
	
	//methods to describe behavior of object
	public boolean iscanSing() {
		return canSing;
		
	}
public void setCanSing(boolean canSing)
{
this.canSing =canSing;	
}

//defining fly method in Bird class
public void fly()
{
	System.out.println("start swining wings");
	System.out.println("Balance body");
	System.out.println("Observe wind Direction");
	
	System.out.println("Based on that swing left or right");
}
}
