import java.util.List;

	public class ExportBooking_ExportBookingDetails_2 {
	    
		public void exportJSON(List<TicketBooking_ExportBooking_3> bookings)
		{
			int i=bookings.size();
			//System.out.println(i);
			TicketBooking_ExportBooking_3 t= new TicketBooking_ExportBooking_3();
			for (TicketBooking_ExportBooking_3 ticketBooking : bookings)
			{
				System.out.print(t.JSON(ticketBooking));
				i--;
				if(i>0)
				{
					System.out.println(",");
				}
			    
			}
		}
		public void exportCSV(List<TicketBooking_ExportBooking_3> bookings)
		{
			TicketBooking_ExportBooking_3 t= new TicketBooking_ExportBooking_3();
			for (TicketBooking_ExportBooking_3 ticketBooking : bookings) {
				System.out.println(t.CSV(ticketBooking));
			}
			
		}
	}

