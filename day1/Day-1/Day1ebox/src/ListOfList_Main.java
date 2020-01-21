import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

	public class ListOfList_Main {

	    public static void main(String[] args) throws Exception, IOException {
	        InputStreamReader e= new InputStreamReader(System.in);//Initializing input stream reader
			BufferedReader br= new BufferedReader(e);//Initializing buffered reader
			List<List<Integer>> li= new ArrayList<List<Integer>>();//Initializing arrayList to store list
			List<Integer> list = new ArrayList<Integer>();//Initializing arraylist to store list values
			char sel=0;//Set selector as zero
			System.out.println("Enter the count of booked tickets:");
			for(int i=0;i<5;i++)//Get count of booked tickets
			{
				System.out.println("On Day "+(i+1));
				String s= br.readLine();
				//Spit tickets count
				String a[]=s.split(",");
				for(int j=0;j<a.length;j++)
				{
					list.add(100-Integer.parseInt(a[j]));//Store it into a list
				}
				li.add(list);//Add lists into arraylist
			}
			// do loop stars from here
			do
			{
				System.out.println("Enter the day to know its remaining ticket count:");//Get day from user
				int n=Integer.parseInt(br.readLine());
				System.out.print("Remaining tickets:[");
				System.out.print(list.get(4*n-4)+", "+list.get(4*n-3)+", "+list.get(4*n-2)+", "+list.get(4*n-1)+"]\n");
				System.out.println("Do you want to continue?(y/n)");//Get user choice
				sel=br.readLine().charAt(0);
				//If user choice is yes repeat loop
			      }
			while(sel=='y'||sel=='Y');
		}

	}

