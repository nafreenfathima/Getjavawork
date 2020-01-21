import java.util.Scanner;
public class StringBuilder1 {
	  public static void main(String[] args) {
			
			Scanner z= new Scanner(System.in);
			
			System.out.println("Enter the number of items:");
			int n= z.nextInt();
			
	        z.nextLine();
			System.out.println("Enter the item details in the format(Item Name$Item Type$Item Cost$Item Availability)");
			
			String[] s= new String[n];
			
	        System.out.println("Items:");
			for(int i=0;i<n;i++)
			{
	    
			s[i]=(String) z.nextLine();
			}
			
			for(int j=0;j<n;j++)
			{
				String[] a=s[j].split("\\$");
			Item1 it= new Item1(a[0],a[1],Integer.parseInt(a[2]),Integer.parseInt(a[3]));
			
			StringBuffer sb= new StringBuffer();
			
			sb.append(it);
			String x=null;
			if(Integer.parseInt(a[3])>0)
			{
			x=new String("Available");
			}
			else
			{
				x=new String("Not Available");
			}
			System.out.print(sb.append(x)+"\n");
			}
			

		}

	}

