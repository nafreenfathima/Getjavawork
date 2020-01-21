import java.util.*; 
	public class Hashmap2Collections {
	   
	 public static void findPass(HashMap<Integer,Integer> hm)
	 {
	 
	  for(Map.Entry<Integer,Integer> entry:hm.entrySet())
	   
	      { 
	   if(entry.getValue()>75)
	   {
	         System.out.println(entry.getKey());  
	      } 
	      }
	  
	 }
	 public static void main(String[] args) {
	  
	  Scanner z=new Scanner(System.in);
	  int n = Integer.parseInt(z.nextLine());
	  HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
	  for(int i=0;i<n;i++)
	  {
	  hm.put(z.nextInt(), z.nextInt());
	  }
	  findPass(hm);
	  
	 }
	}

