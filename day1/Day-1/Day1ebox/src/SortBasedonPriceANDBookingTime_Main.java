import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortBasedonPriceANDBookingTime_Main {
public static void main(String[] args) throws NumberFormatException, ParseException {
        
    	Scanner z= new Scanner(System.in);//Initializing scanner
		List<TicketBooking_1> li= new ArrayList<TicketBooking_1>();//Creating arraylist to store values
		System.out.println("Enter the number of bookings:");//Get number of bookings from user
		int n= Integer.parseInt(z.nextLine());
		
		for(int i=0;i<n;i++)//Get booking details
		{
			System.out.println("Enter the details of booking "+(i+1));
			String data= z.nextLine();
			String a[]= data.split(",");//Split the string 
			TicketBooking_1 tb= new TicketBooking_1(a[0],(new SimpleDateFormat("dd-MM-yyyy").parse(a[1])),a[2],Double.parseDouble(a[3]));
			li.add(tb);//Creating object for Ticket booking class and adding it to arrayList
		}
		System.out.println("Sorted Order:");
		Collections.sort(li,new PriceAndBookingTimeComparator());//Sorting using price and Booking time comparator
		System.out.printf("%-15s%-15s%-15s%-15s\n","Event name","Booking Time","Seat number","Price");
		for (TicketBooking_1 ticketBooking : li) {//Printing sorted list
			System.out.println(ticketBooking);
		}

	}
}

