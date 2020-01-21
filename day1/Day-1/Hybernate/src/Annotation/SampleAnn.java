package Annotation;

import java.util.ArrayList;
import java.util.List;

public class SampleAnn {
@MySampleAnn(name="fathima", desc="checking annotation...")
public void myTestMethod() {
	List<String> interests=new <String>ArrayList();
	System.out.println(""+this.getClass().toString());
	           interests.add("Reading books");
	           interests.add("Listinig music");
	           interests.forEach(System.out::println);
}
}
