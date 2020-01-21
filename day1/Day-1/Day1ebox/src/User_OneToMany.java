import java.util.ArrayList;
import java.util.List;

	public class User_OneToMany {
	       
	    private String name;
		private String contactNumber;
		private List<Hall_OneToMany> hallList= new ArrayList<Hall_OneToMany>();
		public User_OneToMany() {
			super();
		}

		public User_OneToMany(String name, String contactNumber) {
			super();
			this.name = name;
			this.contactNumber = contactNumber;
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		void addToHallList(Hall_OneToMany hall)
		{
			hallList.add(hall);
		}

		/*@Override
		public String toString() {
			return "User [name=" + name + ", contactNumber=" + contactNumber + "]";
		}*/
		
		public void displayDetails() {
			for (Hall_OneToMany hall : hallList) {
				System.out.println(hall);
			}
		}
		
		public void checkOwner(String s)
		{
			int i=0,temp=0;
			for (Hall_OneToMany hall : hallList) {
				i=i+1;
				if(hall.getOwnerName().equals(s))
				{
					//i=i+1;
					System.out.println("Hall "+i);
					System.out.println("Name:"+hall.getName());
					System.out.println("Cost per day:"+hall.getCostPerDay());	
					temp++;
				}
			}
			if(temp==0)
			{
				System.out.println("No halls are available");
			}
		}

		

	}

	