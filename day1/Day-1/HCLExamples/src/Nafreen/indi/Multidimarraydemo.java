package myarrays;

import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 
public class Multidimarraydemo {
	
	public static void main(String args[])throws IOException
	{
		
		String studentName[]= {"Siva","Ram"};
		String subjectName[]= {"Maths","Physics","Chemistry"};
		int marks[][][]=new int[2][2][3];
		//int year=1;
		//create input stream reader object to accept data from keyboard
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	
		for(int i=0;i<2;i++)
			
		{
			out.println("Marks for the year:"+(i+1));
			for(int j=0;j<2;j++) {
				out.println("Enter"+studentName[j]+"Marks:");
				for(int k=0;k<3;k++)
				{
					
				out.println("Marks for"+subjectName[k]);
				marks[i][j][k]=Integer.parseInt(br.readLine());
					
				}	
					
				}
		}
			//show accepted marks for 2 years
			display(marks,studentName,subjectName);
	
	}	
	
	public static void display(int m[][][],String sName[],String subName[] )
			
	{		
				
	for(int i=0;i<2;i++)
	{
		out.println("Marks for the year:"+(i+1));
		for(int j=0;j<2;j++){
			out.println(sName[j]+"Marks:");
		
			for(int k=0;k<3;k++){
			out.println("Marks for"+subName[k]);
		out.println(m[i][j][k]);
	}
				
	}

	}
	
	}
}

				
				
				
				
				
				
			
		


