package springpack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		///SpringApplicationExample5/src/springpack/applicationContext.xml
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Blogger blogger = (Blogger) factory.getBean("blogger");
		blogger.printBloggerDetails();
	}
}
