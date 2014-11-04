package jdbcspring;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
 
public class OurLogic
{
    public static void main(String args[])
    {
        Resource res = new ClassPathResource("spconfig.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
 

 
        SpringJdbcSelect jt =(SpringJdbcSelect)factory.getBean("id3");
        jt.loadAll();
    }
}