import java.util.Scanner;

	public class OverridingSimple {
		
		public static void main(String args[])
		{
		Scanner k=new Scanner(System.in);
		  Event e=new Event();
		       Exhibition ex=new Exhibition();
		        StageEvent se = new StageEvent();
		        System.out.println("Enter the name of the event:");
		        String name=k.nextLine();
		        e.getName();
		        System.out.println("Enter the detail of the event:");
		        String detail=k.nextLine();
		        e.getDetail();
		        System.out.println("Enter the owner name of the event:");
		        String ownerName=k.nextLine();
		        e.getOwnerName();
		        System.out.println("Enter the type of the event:\n1.Exhibition\n2.StageEvent");
		        int choice=k.nextInt();
		        if(choice==1 || choice==2)
		        {
		        
		        
		  if(choice==1)
		       {
		  System.out.println("Enter the number of stalls:");
		       int noOfStalls=k.nextInt();
		       ex.getNoOfStall();
		       
		       se.getNoOfShows();
		           System.out.println("The projected revenue of the event is "+ex.projectedRevenue(noOfStalls));
		       }
		       else if (choice==2)
		       {
		      System.out.println("Enter the number of shows:");
		           int noOfShows=k.nextInt();
		           se.getNoOfShows();
		           System.out.println("Enter the number of seats per show:");
		           int noOfSeatsPerShow=k.nextInt();
		           System.out.println("The projected revenue of the event is "+se.projectedRevenue(noOfSeatsPerShow,noOfShows));
		       }
		        }
		       else
		            {
		            System.out.println("Invalid Customer Type");
		            } 
		      
		    
		      
		    }
		}



