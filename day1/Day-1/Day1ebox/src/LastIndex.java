import java.util.Scanner;

	public class LastIndex{

	    public static void main(String[] args) {
			
			Scanner S= new Scanner(System.in);
			
			System.out.println("Enter the string");
			String p= S.nextLine();
			
			System.out.println("Enter the string to be searched");
			String q= S.next();
			
			System.out.println("The index of last occurence of \""+q+"\" is "+p.lastIndexOf(q));
			System.out.println("Enter the index limit");
			int z= S.nextInt();
			
			String s=p.substring(0,z);
			
			System.out.println("First occurence of \""+q+"\" from "+z+"th index backwards is "+(s.lastIndexOf(q)));
			}
			

		}



