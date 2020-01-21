import java.util.Arrays;
public class Equals {
	
	
	    public static boolean areEqual(int arr1[], int arr2[])
	    {
	    int p = arr1.length;
	        int q = arr2.length;
	        if (p!= q)
	         return false;
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        for (int i = 0; i < p; i++)
	            if (arr1[i] != arr2[i])
	                return false;
	        return true;
	    }
	    public static void main(String[] args)
	    {
	        int arr1[] = {2,5,7,1,2};
	        int arr2[] = {7,1,9,8,4};
	        if (areEqual(arr1, arr2))
	            System.out.println("Equal");
	        else
	            System.out.println("Not Equal");
	    }
	}


