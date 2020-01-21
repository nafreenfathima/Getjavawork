import java.util.Scanner;
public class Construtorsoop {
    public static void main(String args[]) throws Exception{
//write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the stall category:");
        String n=sc.nextLine();
        System.out.println("Enter the details of the stall category:");
        String d=sc.nextLine();
        StallCategory scd=new StallCategory();
        System.out.println("Name:"+n+"\nDetail:"+d);
        StallCategory scp=new StallCategory(n,d);
       
    }
}
