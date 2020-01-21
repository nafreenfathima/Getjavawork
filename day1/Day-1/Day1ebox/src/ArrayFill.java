import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
    public class ArrayFill {

	 public static void main(String[] args) throws IOException {
	 
	  InputStreamReader input= new InputStreamReader(System.in);
	  BufferedReader br= new BufferedReader(input);
	 
	  System.out.println("Enter the pixels of the image :");
	  String s=br.readLine();
	 
	  String x[]=s.split(" ");
	 
	 
	  int a[]= new int[x.length];
	 
	  for(int i=0;i<x.length;i++)
	  {
	   a[i]= Integer.parseInt(x[i]);
	  }
	 
	  System.out.println("Enter the new pixel value :");
	  int n= Integer.parseInt(br.readLine());
	 
	  Arrays.fill(a, n);
	 
	  System.out.print("Image Pixels :");
	  System.out.print("[");
	  for(int i=0;i<x.length;i++)
	  {
	   System.out.print(a[i]);
	   if(i==(x.length-1))
	    break;
	   System.out.print(", ");
	  }
	  System.out.print("]");

	 }

	}

