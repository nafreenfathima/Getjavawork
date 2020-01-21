public class ConstructorCopyValues {
	  
	    int id;  
	    String name;  
	    //constructor to initialize integer and string  
	    ConstructorCopyValues(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //constructor to initialize another object  
	    ConstructorCopyValues(ConstructorCopyValues c){  
	    id = c.id;  
	    name =c.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	ConstructorCopyValues c1 = new ConstructorCopyValues(05,"Nafreen");  
	    	ConstructorCopyValues c2 = new ConstructorCopyValues(c1);  
	    c1.display();  
	    c2.display();  
	   }  
	}  

