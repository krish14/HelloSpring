package allController;

import org.hibernate.*;
import org.hibernate.cfg.*;

import allModel.ModelStudent;

public class SelStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration(); 
		cfg.configure("resource\\hibernate.cfg.xml");
		
		SessionFactory f = cfg.buildSessionFactory();
		Session s = f.openSession();

		Object resDataObject = s.load(ModelStudent.class, new Integer(3));
		ModelStudent mS = (ModelStudent) resDataObject;
				
		System.out.println("First Student name is____"+ mS.getName());
		System.out.println("Its working ...!!");
		
		Transaction tx = s.beginTransaction();
		//s.delete(mS);
		System.out.println("Deleting the object...!!");
		//tx.commit();
		
		//tx = s.beginTransaction();
		
		//for(int i=20; i<=40; i++){
			mS = new ModelStudent();
			mS.setId(1);
			mS.setName("MOHAN");
			mS.setAge(100+1);
			s.update(mS);
		//}
		
		tx.commit();
		
		
		s.close();
		f.close();
		
	}

}
