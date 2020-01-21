import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class OneToMany_Main {
	    
		public static void main(String args[])
		{
			List<User_OneToMany> li= new ArrayList<User_OneToMany>();
			Scanner ke= new Scanner(System.in);
			
			System.out.println("Enter the number of users:");
			int n1= Integer.parseInt(ke.nextLine());
			for(int i=0;i<n1;i++)
			{
				System.out.println("User"+(i+1)+"\r\nName:");
				String name= ke.nextLine();
				System.out.println("contact number:");
				String connum= ke.nextLine();
				User_OneToMany u= new User_OneToMany(name, connum);
				li.add(u);
			}
			
			System.out.println("Enter the number of halls:");
			int n2= Integer.parseInt(ke.nextLine());
			User_OneToMany user= new User_OneToMany();
			for(int i=0;i<n2;i++)
			{
				System.out.println("Hall"+(i+1)+"\r\nName:");
				String hname= ke.nextLine();
				System.out.println("Cost per day:");
				int hcost= Integer.parseInt(ke.nextLine());
				System.out.println("Owner Name:");
				String howner= ke.nextLine();
				Hall_OneToMany h= new Hall_OneToMany(hname, hcost, howner);
				user.addToHallList(h);
			}
			
			//user.displayDetails();
			
			for (User_OneToMany u : li) {
				System.out.println("Owner Name:"+u.getName());
				user.checkOwner(u.getName());
				
			}
		}

	}


