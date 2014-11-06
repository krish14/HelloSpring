package allController;

import java.util.Iterator;
import java.util.List;
import javaAbstract.GetFactory;

import org.hibernate.*;
import org.hibernate.cfg.*;

import allModel.ModelStudent;

public class SelHqlStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resource\\hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		//SessionFactory sf = new GetFactory().GetFactory();
		Session s = sf.openSession();
		
		ModelStudent ms = new ModelStudent();
		Transaction tx = s.beginTransaction();
		Query q = s.createQuery("select ms from ModelStudent ms");
		List l = q.list();
		Iterator i =l.iterator();
		while(i.hasNext()){
			Object o = i.next();
			ms = (ModelStudent) o;
			System.out.println(ms.getId()+"____"+ms.getName()+"____"+ms.getAge());
		}
		
		tx.commit();
		s.close();
		sf.close();		

	}

}
