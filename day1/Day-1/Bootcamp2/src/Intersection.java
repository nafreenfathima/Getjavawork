import java.util.Scanner;

	public class Intersection {

		 public static int intersectionOfTwoArrays(int a[],int b[])
		  {
		   int c=0;
		   System.out.print("{");
		   for(int i = 0; i<a.length; i++ )
		   {
		           for(int j = 0; j<b.length; j++)
		           {
		              if(a[i]==b[j])
		              {
		                 System.out.print(b[j]+ " ");
		              }
		           }
		   
		   
		  }
		   return c;
		  }
		 
		 
		 public static void main(String[] args) {
		  int a[] = {10,4,5,8,6};
		       int b[] = {9,5,4,7,11};
		       int c[]=new int[10];
		       System.out.print("c =");
		       //System.out.println("Intersection of the two arrays:");
		      int returnValue=intersectionOfTwoArrays(a,b);
		      for (int i=0; i<returnValue; i++) 
		      {
		    	  System.out.print(c[i]+" "); 
		      }
		     
		     System.out.print("}");
		 }
		}
