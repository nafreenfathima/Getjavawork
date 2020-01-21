

	import java.util.Scanner;
	public class Oranges {
	public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				System.out.println("Enter number of oranges:");
				int oranges=input.nextInt();
				
				int gross=oranges/144;
				int aboveGross=oranges%144;
				
				int dozens= aboveGross /12;
				int extras=aboveGross% 12;
				System.out.println("Your num of oranges is: "+gross+"gross, "+dozens+" dozen, and "+extras);
				
				

			}

		}

