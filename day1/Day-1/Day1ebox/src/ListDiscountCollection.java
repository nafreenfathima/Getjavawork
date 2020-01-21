import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
	public class ListDiscountCollection {

	    public static void main(String[] args) {
	        Scanner p = new Scanner(System.in);
	        System.out.println("Enter the number of passengers in First friday flight from Chennai to Coimbatore");
	        int h,h1,h2,count;
	        //String name;
	        h=p.nextInt();
	        System.out.println("Enter the passengers Names");
	        ArrayList<String> al = new ArrayList<String>();
	       // ArrayList<String> al1 = new ArrayList<String>();
	        //ArrayList<String> al2 = new ArrayList<String>();
	       for(int i=0;i<h;i++)
	       {
	        al.add(p.next());
	       }
	       System.out.println("Enter the number of passengers in Second friday flight from Chennai to Coimbatore");
	      h1=p.nextInt();
	       System.out.println("Enter the passengers Names");
	       for(int i=0;i<h1;i++)
	       {
	        al.add(p.next());
	       
	       }
	       System.out.println("Enter the number of passengers in third friday flight from Chennai to Coimbatore");
	       h2=p.nextInt();
	       System.out.println("Enter the passengers Names");
	       for(int i=0;i<h2;i++)
	       {
	        al.add(p.next());
	       
	       }
	      
	      
	       System.out.println("Selected passengers for discount:");
	       HashSet<String> hsUnique = new HashSet<String>(al);
	       List<String> list = new ArrayList<String>(hsUnique);
	       Collections.sort(list);
	      for(String s :list)
	      {
	     
	        count=Collections.frequency(al, s);
	       if(count==3)
	       {
	       
	       System.out.println(s);
	       }
	      }
	      
	 }
	}


