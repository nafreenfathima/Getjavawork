import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
	public class Main_ManyToMany {
	    public static void main(String[] args) throws NumberFormatException {
	Scanner ke= new Scanner(System.in);
	List<Integer> noOfEvents= new ArrayList<Integer>();
	System.out.println("Enter the number of halls:");
	int n= Integer.parseInt(ke.nextLine());
	System.out.println("Enter the hall details in comma separated(Name,Cost per day,Event Type-1,Event Type-2,.....,Event Type-n)");
	EventType_ManyToMany et= new EventType_ManyToMany();
	Hall_ManyToMany h= new Hall_ManyToMany();
	for(int i=0;i<n;i++)
	{
	String s= ke.nextLine();
	String p[]= s.split(",");
	Hall_ManyToMany h1= new Hall_ManyToMany(p[0],Integer.parseInt(p[1]));
	et.addToHallList(h1);
	h.addToHallList(h1);
	h.addToNoOfEvents(p.length-2);
	for(int j=2;j<p.length;j++)
	{
	EventType_ManyToMany e= new EventType_ManyToMany(p[j]);
	h.addToEventTypeList(e);
	}
	}
	System.out.println("Enter the event name to get the halls:");
	String event= ke.nextLine();
	        System.out.println("Event Name:"+event);
	System.out.println("Halls:");
	h.checkEvent(event);
	}
	}

