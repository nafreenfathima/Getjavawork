

import java.util.Scanner;
public class LuckyWinner_basicelements_4 {


    public static void main(String args[])
    {
        int num,lastdigit;
       
        Scanner sc=new Scanner(System.in);
    System.out.println("");
    num=sc.nextInt();
    lastdigit = num % 10;
if((lastdigit==8)||(lastdigit==3))
{
    System.out.println("Lucky Winner");
}
else
    {
    System.out.println("Not a Lucky Winner");
    }
}
}


