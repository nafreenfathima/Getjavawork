package com.mybeans;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class Triangled {
	public static void main(String[] args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("gk.cfg.xml").build();  
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session s = factory.openSession();  
		Transaction t=s.beginTransaction();
		//t.begin();
		Point p3= new Point(2,3,4,5,6,4);
		
		double area= p3.CalcArea();
		
		Triangle t3=new Triangle(3,"t3",area);
		s.saveOrUpdate(t3);
		
		t.commit(); 
		System.out.println("successfully created");
		factory.close(); 
		s.close();
		 		
	}
	}




