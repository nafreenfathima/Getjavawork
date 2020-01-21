package oop;

public class Bird {
	//instance variables needed to store object data
	public static int legs=2;
	public static int wings=2;
	String birdName;
	String birdColor;
	private boolean singStatus;  
	
	//setter method to set value for private variable
	public void setsingingStatus()
	{
		if(this.birdName.equalsIgnoreCase("kokila"))
		{
		singStatus=true;
		}
	}
	
	
	//methods to describe the behavior of object
	public void walk()
	{
		System.out.println(birdColor+" "+birdName+" is walking with"+legs+" legs.");
	}
	public void fly()
	{
		System.out.println(birdColor+" "+birdName+" is flying with"+wings+" wings.");
	}
	public void sing()
	{
		if(singStatus)
		{
			System.out.println("la ra looo... la ra loo...");
		}
			else 
			{
				System.out.println("can't sing!!");
				
			}
		}
	}
	
	

