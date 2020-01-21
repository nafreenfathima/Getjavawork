import java.util.ArrayList;

public class Sequential {
	 
	

	 public static void main(String[] argv) {

	     Sequential search = new Sequential();

	     ArrayList<Integer> alist = new ArrayList<Integer>();
	     alist.add(1);
	     alist.add(3);
	     alist.add(5);
	     alist.add(7);

	     int num = 5;


	     ArrayList<String> alist2 = new ArrayList<String>();
	     alist2.add("A");
	     alist2.add("B");
	     alist2.add("C");
	     alist2.add("D");

	     String word = "C";


	     System.out.println(search.linearSearch(alist, num));

	     System.out.println(search.linearSearch(alist2, word));


	 }

	 public int linearSearch(ArrayList rrr, T wordnum) {
	     for (int i=0; i < rrr.size(); i++) {
	         if (wordnum.equals(rrr.get(i))) {
	             return i;

	         };
	     };
	     return -1;
	 }
	
	
	
	
}
