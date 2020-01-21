
public final class Student1 {
	
	    final String Name; 
	    final int RollNo; 
	  
	    public Student1(String Name, int RollNo) 
	    { 
	        this.Name = Name; 
	        this.RollNo = RollNo; 
	    } 
	    public String getName() 
	    { 
	        return Name; 
	    } 
	    public int getRollNo() 
	    { 
	        return RollNo; 
	    } 
	} 
	  
	// Driver class 
	class Test 
	{ 
	    public static void main(String args[]) 
	    { 
	        Student1 s = new Student1("Nafreen", 41); 
	        System.out.println(s.getName()); 
	        System.out.println(s.getRollNo()); 
	  
	       
	    } 
	} 



