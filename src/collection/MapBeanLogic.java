package collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class MapBeanLogic {
 
    public static void main(String[] args)
    {
        Resource res = new ClassPathResource("Beans.xml");
        BeanFactory factory = new XmlBeanFactory(res);
 
        Object o = factory.getBean("id4");
        MapBean wb = (MapBean)o;
 
        wb.show();
 
    }
 
}