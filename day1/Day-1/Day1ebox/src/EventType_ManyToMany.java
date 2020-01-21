import java.util.ArrayList;
	import java.util.List;
public class EventType_ManyToMany {
 private String name;
	private List<Hall_ManyToMany> hallList=new ArrayList<Hall_ManyToMany>();
	public EventType_ManyToMany() {
	super();
	}
	public EventType_ManyToMany(String name) {
	super();
	this.name = name;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	void addToHallList(Hall_ManyToMany hall)
	{
	hallList.add(hall);
	}
	public List copyNoOfevents()
	{
	return hallList;
	}
	}

