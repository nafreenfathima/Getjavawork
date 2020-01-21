package codecamp2;
import java.util.Scanner;
public class Program3 {
	

	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	String ename;
	int digitallogic1,digitallogic2,digitallogic3;
	int java1,java2,java3;
	int networking1,networking2,networking3;
	int digitalsum,digitalaverage;
	int javasum,javaaverage;
	int networkingsum,networkingaverage;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter scholar1 name:");
	ename=sc.next();
	System.out.println("enter marks of digital logic:");
	digitallogic1=sc.nextInt();
    System.out.println("enter marks of networking:");
	networking1=sc.nextInt();
	System.out.println("enter marks of java:");
	java1=sc.nextInt();
	System.out.println("enter Scholar 2 name:");
	ename=sc.next();
	System.out.println("enter marks of digital logic:");
	digitallogic2=sc.nextInt();
	System.out.println("enter marks of networking:");
	networking2=sc.nextInt();
	System.out.println("enter marks of java:");
	java2=sc.nextInt();
	System.out.println("enter Scholar 3 name:");
	ename=sc.next();
	System.out.println("enter marks of digital logic:");
	digitallogic3=sc.nextInt();
	System.out.println("enter marks of networking:");
	networking3=sc.nextInt();
	System.out.println("enter marks of java:");
	java3=sc.nextInt();
	digitalsum=digitallogic1+digitallogic2+digitallogic3;
	digitalaverage=digitalsum/3;
	System.out.println("average of three scholars in Digital-Logic is:"+digitalaverage);
	networkingsum=networking1+networking2+networking3;
	networkingaverage=networkingsum/3;
	System.out.println("average of three scholars in Networking is:"+networkingaverage);
	networkingsum=networking1+networking2+networking3;
	javasum=java1+java2+java3;
	javaaverage=javasum/3;
	System.out.println("average of three scholars in Java is:"+javaaverage);
	}

	}

