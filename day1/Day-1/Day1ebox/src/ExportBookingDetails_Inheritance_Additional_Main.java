import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

	public class ExportBookingDetails_Inheritance_Additional_Main {

	    public static void main(String[] args) throws NumberFormatException, ParseException {
		
		 Scanner z= new Scanner(System.in);
		 ArrayList<TicketBooking_ExportBooking_3> li= new ArrayList<TicketBooking_ExportBooking_3>();
		 System.out.println("Enter the number of bookings:");
		 int n= Integer.parseInt(z.nextLine());
		 System.out.println("Enter the booking details:");
		 for(int i=0;i<n;i++)
		 {
			 String event= z.nextLine();
			 String ev[]= event.split("-");
			 TicketBooking_ExportBooking_3 t= new TicketBooking_ExportBooking_3(ev[0],Double.parseDouble(ev[1]),new SimpleDateFormat("dd/mm/yyyy").parse(ev[2]),ev[3]);
			 li.add(t);
		 }
		 System.out.println("Enter a type:\r\n1.JSON\r\n2.CSV");
		 int sel= Integer.parseInt(z.nextLine());
		 ExportBooking_ExportBookingDetails_2 eb= new ExportBooking_ExportBookingDetails_2();
		 if(sel==1)
		 {
			 System.out.println("[");
			 eb.exportJSON(li);
			 System.out.print("\r\n]");
		 }
		 else if(sel==2)
		 {
			 System.out.println("customer,price,bookingTime,stageEventShow");
			 eb.exportCSV(li);
		 }
		 else
		 {
			 System.out.println("Invalid Input");
		 }

		}

	}

