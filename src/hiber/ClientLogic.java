package hiber;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.cfg.Configuration;

public class ClientLogic {
 
    public static void main(String[] args)
    
    {
        Configuration cfg = new Configuration();
        cfg.configure("resource\\hibernate.cfg.xml");
 
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        PojoExample p = new PojoExample();
 
        p.setStuId(101);
        p.setStuName("iphone");
        p.setStuAge(50);
 
        Transaction tx = session.beginTransaction();
        session.save(p); 
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        factory.close(); 
        
    }
 
}