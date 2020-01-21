import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
	public class Stal_Revenue {
	 public static void main(String[] args) throws IOException {
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	  int m = 0;
	  System.out.println("Enter the number of stalls:");
	  m = Integer.parseInt(br.readLine());
	  
	  List<Stall_Threads> slist = new ArrayList<Stall_Threads>();
	  
	   while(m>0) {
	    Stall_Threads s=new Stall_Threads();
	  String input = br.readLine();
	  
	  String array[]=input.split(",");
	  
	   s.setSname(array[0]);
	   s.setStype(array[1]);
	   s.setA(Double.parseDouble(array[2])); s.setOname(array[3]);
	   
	  //add object to the list
	   slist.add(s);
	   m--;
	 
	  }
	  
	 
	   double totalCost = 0.0;
	  for (Stall_Threads s : slist) {
	   totalCost += s.getA() * 150.0;
	  }

	  System.out.println("The total revenue is " + totalCost);
	 }
	}

