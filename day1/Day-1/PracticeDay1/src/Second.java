import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
	public class Second {
	 public static void main(String[] args) {
	  List l=new ArrayList();
	  String a="Hello how are you doing how do you do";
	 String words[]=  a.split(" ");
	 for(int i=0;i<words.length;i++)
	 {
	 l.add(words[i]);
	 }
	  Iterator i = l.iterator();
	  while(i.hasNext())
	  {
	   System.out.println(i.next());
	  }
	  TreeSet d = new TreeSet(l);
	  
	  List c = new ArrayList(d);
	  
	  System.out.print(c);
	  
	 }
	}


