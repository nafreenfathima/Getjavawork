import java.util.List;

	interface Export_BookingDetails_3 {
	    public String exportJSON(List<TicketBooking_ExportBooking_3> bookings);
		public String exportCSV(List<TicketBooking_ExportBooking_3> bookings);
	}

