package collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ClientLogic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res = new ClassPathResource("Beans.xml");
		BeanFactory factory = new XmlBeanFactory(res);
		
		Object o = factory.getBean("id1");
		empBean eb = new empBean();
		eb = (empBean) o;
		
		Object s = factory.getBean("id2");
		//empBean ebs = new empBean();
		eb = (empBean) s;
		
		eb.show();
		
		
	}

}
