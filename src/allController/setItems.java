package allController;

import java.util.Iterator;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import allModel.ModelItems;
import allModel.ModelStudent;

public class setItems {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resource//hibernate.cfg.xml");

		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();

		Transaction tx = s.beginTransaction();
		ModelItems i = new ModelItems();
		Query q = s.createQuery("select i from ModelItems i");
		List l = q.list();
		Iterator it = l.iterator();
		while (it.hasNext()){
			Object o = it.next();
			i = (ModelItems) o;
			System.out.println(i.getId());
		}

		//int k = 2;
		for(int k=3; k<=10; k++){
			i.setId(k);
			i.setItemName("ITEM__"+k);
			i.setRate(k+10);
			
		}
		s.update(i);
		tx.commit();
		s.close();
		sf.close();
	}
	
}
