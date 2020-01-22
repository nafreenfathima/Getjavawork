package onetoone;
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;    
    
public class StoreData {    
public static void main(String[] args) {    
      
    StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hk.cfg.xml").build();  
    Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
      
    SessionFactory factory=meta.getSessionFactoryBuilder().build();  
    Session session=factory.openSession();  
      
    Transaction t=session.beginTransaction();   
      
    Employee e1=new Employee();    
    e1.setName("Nafreen");    
    e1.setEmail("nafreen@gmail.com");    
        
    Address address1=new Address();    
    address1.setAddressLine1("20-365,murali nagar");    
    address1.setCity("vijayawada");    
    address1.setState("AP");    
    address1.setCountry("India");    
    address1.setPincode(16552);    
        
    e1.setAddress(address1);    
    address1.setEmployee(e1);    
        
    session.persist(e1);    
    t.commit();    
        
    session.close();    
    System.out.println("successfully inserted");    
}    
}    

