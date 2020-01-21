package mycollections;

import java.util.ArrayList;

public class Arraylistdemo {

	public static void main(String[] args) {
ArrayList al=new ArrayList();
//heterogeneous collection
int myage=24;
String myname="Fathima";
long mymemory=45125212l;
al.add(myname);
al.add(myage);
al.add(mymemory);
 System.out.println(al);
 //homogeneous collection
 ArrayList<String>elist=new ArrayList<String>();
 elist.add("Navya");
 elist.add("Susan");
 elist.add("Pratusha");
 for(String s:elist)
 {
	 System.out.println("Employee:"+s);
 }
 if(elist.contains("Fathima"))
 {
	 System.out.println("Fathima is also inside collection of employees");
	 
 }else
 {
	 System.out.println("Fathima is not an employee!!!");
 }
	 }
 

}
