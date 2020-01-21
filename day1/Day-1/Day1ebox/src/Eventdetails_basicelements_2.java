import java.util.Scanner;
	import java.text.DecimalFormat;
	public class Eventdetails_basicelements_2 {
	
		private static DecimalFormat df2 = new DecimalFormat("#.0L");
	
	    public static void main(String args[])
	    {
	    	String EventName="";
	    	String EventType="";
	int NoofPeople;
	String PaidEntry;
	double projectedExpenses=5.74159265359f;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of the event");
	EventName=sc.nextLine();
	System.out.println("Enter the type of the event");
	EventType=sc.nextLine();
	System.out.println("Enter the number of people expected");
	NoofPeople=sc.nextInt();
	System.out.println("Is it a paid entry? (Type Y or N)");
	PaidEntry=sc.next();
	System.out.println("Enter the projected expenses (in lakhs) for this event");
	projectedExpenses=sc.nextDouble();
	System.out.println("Event Name : "+EventName+"\n"+"Event Type : "+EventType+"\n"+"Expected Count : "+NoofPeople+"\n"+"Paid Entry : "+PaidEntry+"\n"+"Projected Expense : "+df2.format(projectedExpenses));
	}
	}



