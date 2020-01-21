import java.util.ArrayList;
import java.util.List;
	public class Hall_ManyToMany {
	   
	private String name;
	private int costPerDay;
	private List<EventType_ManyToMany> eventTypeList= new ArrayList<EventType_ManyToMany>();
	public Hall_ManyToMany() {
	super();
	}
	List<Integer> noOfEvents= new ArrayList<Integer>();
	    public Hall_ManyToMany(String name, int costPerDay) {
	super();
	this.name = name;
	this.costPerDay = costPerDay;
	}
	     
	    public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public int getCostPerDay() {
	return costPerDay;
	}
	public void setCostPerDay(int costPerDay) {
	this.costPerDay = costPerDay;
	}
	public List<EventType_ManyToMany> getEventTypeList() {
	return eventTypeList;
	}
	public void setEventTypeList(List<EventType_ManyToMany> eventTypeList) {
	this.eventTypeList = eventTypeList;
	}
	void addToNoOfEvents(int n)
	    {
	    noOfEvents.add(n);
	    }
	   
	    void addToEventTypeList(EventType_ManyToMany eventType)
	    {
	    eventTypeList.add(eventType);
	    }
	   
	    private List<Hall_ManyToMany> hallList=new ArrayList<Hall_ManyToMany>();
	    void addToHallList(Hall_ManyToMany hall)
	{
	hallList.add(hall);
	}
	   
	   public void checkEvent(String event)
	    {
	    int i=0,j=0,k=0;
	    EventType_ManyToMany ep= new EventType_ManyToMany();
	    /*System.out.println(hallList.size());
	    for (Hall2 hall2 : hallList) {
	System.out.println(hall2.getName());
	}*/
	    for (EventType_ManyToMany eventType : eventTypeList) {
	    if(noOfEvents.get(j)==k)
	    {
	    k=0;
	    j++;
	    }
	if(eventType.getName().equals(event))
	{
	System.out.println(hallList.get(j).getName());
	i++;
	}
	k=k+1;
	}
	    if(i==0)
	    {
	    System.out.println("No halls are available for the event type");
	    }
	   
	}
	}

