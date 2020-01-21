import java.util.Scanner;
public class Terms {
	public static void main(String[] args)
	{

	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter number of  terms");
	 int t=sc.nextInt();
	 int sum=0;
	 System.out.println(sum);
	 for(int i=0;i<(2*t)-1;i++)
	 {
	 int num=(i*1)+2;
	 if(num%2!=0)
	 {
	 
	 sum=sum+num;
	 System.out.println(sum);
	 }
	 }


	}

	}


