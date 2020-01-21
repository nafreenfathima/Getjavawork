import java.util.Comparator;
public class PriceAndBookingTimeComparator implements Comparator<TicketBooking_1> {//Price and booking time comparator implementing comparator

    @Override
    public int compare(TicketBooking_1 booking1, TicketBooking_1 booking2) {//Comparing two objects
    	if(booking1.getPrice()>booking2.getPrice())
    	//If price of object1 is more than object to then return 1
		 return 1;
		else if(booking1.getPrice()<booking2.getPrice())
		//If price of object1 is less than object to then return 1
	     return -1;
		else
		return (booking1.getBookingTime().compareTo(booking2.getBookingTime()));
    	//if price are equal, then compare booking time
			
	}

	
}

