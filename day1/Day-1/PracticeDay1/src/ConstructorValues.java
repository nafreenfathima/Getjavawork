
public class ConstructorValues {
	    int id;  
	    String name;  
	    ConstructorValues(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //method to display the values  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	ConstructorValues  s1 = new ConstructorValues(10,"Nafreen");  
	    	ConstructorValues s2 = new ConstructorValues(50,"Fathima");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}  

