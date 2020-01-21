
import java.util.Scanner;
public class Grossanddozen {
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("How many eggs do you have:");
			int eggs=input.nextInt();
			
			int gross=eggs/144;
			int aboveGross=eggs%144;
			
			int dozens= aboveGross /12;
			int extras=aboveGross% 12;
			System.out.println("Your num of eggs is: "+gross+"gross, "+dozens+" dozen, and "+extras);
			
			}

	}

