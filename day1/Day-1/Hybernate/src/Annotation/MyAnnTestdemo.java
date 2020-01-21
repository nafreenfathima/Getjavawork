package Annotation;

import java.lang.reflect.Method;

public class MyAnnTestdemo {

	public static void main(String[] args)throws Exception {
		   SampleAnn mat=new SampleAnn();
		   Method m=mat.getClass().getMethod("SampleAnn");
		  MySampleAnn ms=m.getAnnotation(MySampleAnn)
		   
		
	}

}
