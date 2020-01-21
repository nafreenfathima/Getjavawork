import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.ObjectInputStream.GetField;
		public class ArrayMain {
		 public static void main(String[] args) throws IOException {
		   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   //enter the variables
		   int k = 0;
		   System.out.println("Enter the number of users:");
		   k = Integer.parseInt(br.readLine());
		   System.out.println("Enter user address in CSV(Username,AddressLine 1,AddressLine 2,PinCode)");
		   List<Address_4> slist = new ArrayList<Address_4>();
		  //use loop
		    while(k>0) {
		     Address_4 s=new Address_4();
		   String input = br.readLine();
		  
		   String array[]=input.split(",");
		  
		    s.setUsername(array[0]);
		    s.setAddressLine1(array[1]);
		    s.setAddressLine2(array[2]);
		    s.setPinCode(Integer.parseInt(array[3]));
		   //add object to the list
		    slist.add(s);
		    k--;
		   
		   }
		  
		    Collections.sort(slist);
		    System.out.println("User Details:");
		       for (Address_4 st: slist) {
		       
		              System.out.println(st.getUsername()+","+st.getAddressLine1()+","+st.getAddressLine2()+","+st.getPinCode());

		  }
		 
		  }
		}



