package javaAbstract;

import org.hibernate.*;
import org.hibernate.cfg.*;

public abstract class GetFactory {

	/**
	 * @param args
	 */
	
	
	public SessionFactory GetFactory(){
		
		Configuration cfg = new Configuration();
		cfg.configure("resource\\hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
				
		return sf;
	}

}
